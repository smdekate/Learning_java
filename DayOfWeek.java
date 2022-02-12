/*******************************************************************************
 * Compilation: javac DayOfWeek.java
 * Execution: java DayOfWeek m d y
 *
 * Read in the month (m), day (d) and year (y) and print out what
 * day of week it falls on according to the Gregorian calendar.
 * For M use 1 for january, 2 for February, and so forth. Outputs
 * 0 for sunday, 1 for monday, and so forth
 *
 *      y0 = y - (14 - m) / 12
 *      x = y0 + y0/4 - y0/100 + y0/400
 *      m0 = m + 12 * ((14 - m) / 12) - 2
 *      d0 = (d + x + (31*m0)/12) % 7
 ******************************************************************************/

public class DayOfWeek {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println(d0);
    }
}
