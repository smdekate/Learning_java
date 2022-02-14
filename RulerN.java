/*******************************************************************************
 * Compilation: javac RulerN.java
 * Execution: java RulerN n
 *
 * Prints the relative lengths of the subdivision on a ruler of
 * order n.
 ******************************************************************************/

public class RulerN {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // ruler of order 0
        String ruler = " ";

        // repeat n times
        for (int i = 1; i <= n; i++) {
            // Concatenate a ruler of order 0, the nuber i, and a ruler of order 0
            ruler = ruler + i + ruler;

            // print out the final result
            System.out.println(ruler);
        }
    }
}
