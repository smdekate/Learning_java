/*******************************************************************************
 * Compilation: javac Ordered.java
 * Execution: java Ordered x y z
 *
 * reads in three integer command line arguments, x, y, and z
 * and prints "true" if the three values are either in ascending or
 * in descending order, and "false" otherwise.
 ******************************************************************************/

public class Ordered {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        boolean b;

        b = (x > y && y > z) || (x < y && y < z);

        System.out.println(b);
    }
}
