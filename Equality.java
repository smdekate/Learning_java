/*******************************************************************************
 * Compilation: javac Equality.java
 * Execution: java Equality str1 str2 str3
 * eads in three parameters and prints true if all three are equal
 * and false otherwise.
 ******************************************************************************/

public class Equality {
    public static void main(String[] args) {
        boolean isEqual = args[0].equals(args[1]);
        isEqual = isEqual && args[1].equals(args[2]);

        System.out.println(isEqual);
    }
}
