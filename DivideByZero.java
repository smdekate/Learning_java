/*******************************************************************************
 * Compilation: javac DivideByZero.java
 * Execution: java DivideByZero
 *
 * Demonstrates what happens when you divide by zero with integers
 * and doubles.
 ******************************************************************************/

public class DivideByZero {
    public static void main(String[] args) {
        System.out.println("17.0 / 0.0 = " + (17.0 / 0.0)); // infinity
        System.out.println("17.0 % 0.0 = " + (17.0 % 0.0)); // not a number
        System.out.println("17 / 0 = " + (17 / 0));         // Error
        System.out.println("17 % 0 = " + (17 % 0));         // Error
    }
}
