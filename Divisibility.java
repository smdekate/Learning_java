/*******************************************************************************
 * Compilation: java Divisibility.java
 * Execution: java Divisibility x y
 *
 * Reads in two integer command-line arguments x and y and prints "true'
 * if both are divisible by 7, and false otherwise.
 ******************************************************************************/

public class Divisibility {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        boolean isDivisible = (x % 7 == 0) && (y % 7 == 0);

        System.out.println(isDivisible);
    }
}
