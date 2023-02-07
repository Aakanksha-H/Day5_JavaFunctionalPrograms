public class SumOfThree {
    public static void main(String[] args) {
     sumOfThreeToZero();
    }

    public static void sumOfThreeToZero(){
        int[] inputArry = {1, 2, 4, -3, -1, 5, 6};

        for (int i = 0; i < inputArry.length; i++) {
            for (int j = i + 1; j < inputArry.length; j++) {
                for (int k = j + 1; k < inputArry.length; k++) {
                    if (inputArry[i] + inputArry[j] + inputArry[k] == 0) {
                        System.out.println("Arry elements to add zero are : " + inputArry[i] + "," + inputArry[j] + " and " + inputArry[k]);
                    }
                }
            }
        }
    }
}
