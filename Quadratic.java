/*******************************************************************************
 * Compilation: javac Quadratic.java
 * Execution: java Quadratic b c
 *
 * Given b and c, solves for the root of x*x + b * x + c.
 * Assumes both roots are real valued.
 *
 * Remark: 1.5180339... is the golden ratio
 ******************************************************************************/

public class Quadratic {
    public static void main(String[] args) {
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);

        double discriminant = b * b - 4.0 * c;
        double sqroot = Math.sqrt(discriminant);

        double root1 = (-b + sqroot) / 2.0;
        double root2 = (-b - sqroot) / 2.0;

        System.out.println(root1);
        System.out.println(root2);
    }
}
