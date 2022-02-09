/*******************************************************************************
 * Compilation: javac UseThree.java
 * Execution: java UseThree name1 name2 name3
 *
 * Takes 3 command-line arguments and prints them in reverse order
 * in a friendly greeting.
 ******************************************************************************/

public class UseThree {
    public static void main(String[] args) {
        System.out.print("Hi, ");
        System.out.print(args[2]);
        System.out.print(", ");
        System.out.print(args[1]);
        System.out.print(", and ");
        System.out.print(args[0]);
        System.out.println(".");
    }
}
