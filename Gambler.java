/*******************************************************************************
 * Compilation: javac Gambler.java
 * Execution: java Gambler stake goal N
 *
 * Simulate a gambler who start with $stake and place fair $1 bets
 * until she goes broke or reach $goal. Keeps tracke of the number of
 * times she wins and the number of bets she makes, Run the experiment N
 * times, average the results, and prints them out.
 ******************************************************************************/

public class Gambler {
    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);  // gambler's stating bankroll
        int goal = Integer.parseInt(args[1]);   // gambler's desired bankroll
        int trials = Integer.parseInt(args[2]); // number of trials to perform

        int bets = 0;       // total number of bets made
        int wins = 0;       // total number of games won

        // repeat trials times
        for (int i = 0; i < trials; i++) {

            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;     // win $1
                else cash--;                         // lose $1
            }
            if (cash == goal) wins++;       // did gambler fo achieve desired goal
        }

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets = " + 1.0 * bets / trials);
    }
}
