import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        quadratic(1,2,3);
    }

    public static void quadratic(double a, double b, double c){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        c = input.nextDouble();

        double delta = b * b - 4.0 * a * c;

        if (delta > 0.0){
            double root1 = (-b + Math.pow(delta, 0.5)) / (2.0 * a);
            double root2 = (-b - Math.pow(delta, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else {
            System.out.println("Roots are not real");
        }
    }
}
