/*******************************************************************************
 * Compilation: javac Distance.java
 * Execution: java Distance x y
 *
 * prints the distance from (x, y) to the origin, where x and y
 * are integers.
 ******************************************************************************/

public class Distance {
    public static void main(String[] args) {

        // parse x and y-coordinates from command-line arguments
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        // compute distance to (0. 0)
        double dist = Math.sqrt(x * x + y * y);

        // output distance
        System.out.println("Distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }
}
