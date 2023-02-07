public class Distance {
    public static void main(String[] args) {
    distance(12,23);
    }

    public static void distance(int x, int y){
        double distance;
        //distance = Math.sqrt(x*x + y*y);
        distance = Math.pow(x,y);
        System.out.println("Distance between " + x + " and " + y + " is " + distance);
    }
}
