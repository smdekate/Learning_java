/*******************************************************************************
 * Compilation: javac Trig.java
 * Execution: java Trig angle
 *
 * Illustrates various trig operations, Reads in an angle (in degrees),
 * converts to radians, and performs various trigonometric calculations.
 ******************************************************************************/

public class Trig {
    public static void main(String[] args) {
        double degrees = Double.parseDouble(args[0]);
        double radians = Math.toRadians(degrees);

        double s = Math.sin(radians);
        System.out.println("sin(" + degrees + ") = " + s);

        double c = Math.cos(radians);
        System.out.println("cos(" + degrees + ") = " + c);

        double t = Math.tan(radians);
        System.out.println("tan(" + degrees + ") = " + t);
        System.out.println(s + " / " + c + " = " + s / c);

        double r = s * s + c * c;
        System.out.println(s * s + " + " + c * c + " = " + r);
    }
}
