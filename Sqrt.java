/*******************************************************************************
 * Compilation: javac Sqrt.java
 * Execution: java Sqrt c
 *
 * Computes the square root of a nonnegative number c using
 * Newton's method:
 *      - initialize t = c
 *      - replace t with the average of c/t and t
 *      - repeat until desired accuracy reached
 ******************************************************************************/

public class Sqrt {
    public static void main(String[] args) {

        // read in the command-line argument
        double c = Double.parseDouble(args[0]);
        double epsilon = 1.0e-15;   // relative error toleerance
        double t = c;

        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c / t) > epsilon) {
            t = (t + c / t) / 2.0;
        }

        // print out the estimate of the square root of c
        System.out.println(t);
    }
}
