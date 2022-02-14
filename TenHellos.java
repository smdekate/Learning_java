/*******************************************************************************
 * Compilation: javac TenHellos.java
 * Execution: java TenHellos
 *
 * Prints ith Hello for i = 1 to 10. Illustrates using a while loop
 * for a repetitive task.
 ******************************************************************************/

public class TenHellos {
    public static void main(String[] args) {
        // prints out special cases whose ordinal doesn't end in th
        System.out.println("1st Hello");
        System.out.println("2nd Hello");
        System.out.println("3rd Hello");

        // Count from i = 4 to 10
        int i = 4;
        while (i <= 10) {
            System.out.println(i + "th Hello");
            i = i + 1;
        }
    }
}
