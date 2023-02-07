import java.util.Scanner;

public class TwoDArry {
    public static void main(String[] args) {
        twoDArray();
    }

    public static void twoDArray(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Row length of an array : ");
        int row = scanner.nextInt();
        System.out.println("Enter column length of an array : ");
        int column = scanner.nextInt();
        int[][] arry = new int[row][column];
        int input = row * column;

        System.out.println("Enter the " + input + "element to store in arry");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arry[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The ements in arry are");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println(arry[i][j]);
            }
        }
    }
}
