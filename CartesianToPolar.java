/*******************************************************************************
 * Compilation: javac CartesianToPolar.java
 * Execution: java CartesianToPolar x y
 *
 * Read in cartesian coordinates (x, y) and print out polar coordinates
 * (r, theta)
 ******************************************************************************/

public class CartesianToPolar {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);

        System.out.println("r       = " + r);
        System.out.println("theta   = " + theta);
    }
}
