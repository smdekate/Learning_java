/*******************************************************************************
 * Compilation: javac FibonacciWord.java
 * Execution: java FibonacciWord
 *
 * hat prints the Fibonacci word of order 0 through 10.
 * f(0) = "a", f(1) = "b", f(2) = "ba", f(3) = "bab", f(4) = "babba",
 * and in general f(n) = f(n-1) followed by f(n-2).
 ******************************************************************************/

public class FibonacciWord {
    public static void main(String[] args) {
        String f0 = "a";
        String f1 = "b";
        String f2 = f1 + f0;
        String f3 = f2 + f1;
        String f4 = f3 + f2;
        String f5 = f4 + f3;
        String f6 = f5 + f4;
        String f7 = f6 + f5;
        String f8 = f7 + f6;
        String f9 = f8 + f7;
        String f10 = f9 + f8;

        System.out.println("f0 = " + f0);
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);
        System.out.println("f5 = " + f5);
        System.out.println("f6 = " + f6);
        System.out.println("f7 = " + f7);
        System.out.println("f8 = " + f8);
        System.out.println("f9 = " + f9);
        System.out.println("f10 = " + f10);
    }
}
