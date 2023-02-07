public class WindChill {
    public static void main(String[] args) {
     windChill(14.4,23.4);
    }

    public static void windChill(double t, double v){
        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Temperature in Fahrenheit = " + t);
        System.out.println("Wind speed in miles per hour = " + v);
        System.out.println("Wind chill  = " + w);
    }
}
