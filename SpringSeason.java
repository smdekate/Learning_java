/*******************************************************************************
 * Compilation: javac SpringSeason.java
 * Execution: java SpringSeason day month
 *
 * Prints true if the given day and month false between March 20 (inclusiv)
 * and June 20 (inclusive).
 ******************************************************************************/

public class SpringSeason {
    public static void main(String[] args) {
        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);

        boolean isSpring = (month == 3 && day >= 20 && day <= 31)
                || (month == 4 && day >= 1 && day <= 30)
                || (month == 5 && day >= 1 && day <= 31)
                || (month == 6 && day >= 1 && day <= 30);

        System.out.println(isSpring);
    }
}
