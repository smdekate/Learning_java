/*******************************************************************************
 * Compilation: javac TriangleArea.java
 * Execution: java TriangleArea a b c
 * takes three command line inputs a, b, and c, representing the
 * side lengths of a triangle, and prints the area of the triangle
 * using Heron's formula: area = sqrt(s(s-a)(s-b)(s-c)), where s = (a + b + c) / 2.
 ******************************************************************************/

public class TriangleArea {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double s = (a + b + c) / 2.0;

        // Heron's Formula
        double area = Math.sqrt((s * (s - a) * (s - b) * (s - c)));

        System.out.println(area);
    }
}
