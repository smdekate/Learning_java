/*******************************************************************************
 * Compilation: javac WindChill.java
 * Execution: java WindChill t v
 *
 * Given the temprature t (in Fahrenheit) and the wind speed v
 * (in miles per hour), compute the windchill w using the formula
 * from the National Weather Service.
 *
 *      w = 35.75 + 0.621*t + (0.4275*t - 35.75) * v ^ 0.16
 *
 * Reference: http://www.nws.noaa.gov/om/windchill/index.shtml
 ******************************************************************************/

public class WindChill {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        double w = 35.75 + 0.621 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

        System.out.println("Tempratue  = " + t);
        System.out.println("Wind speed = " + v);
        System.out.println("Wind Chill = " + w);
    }
}
