import java.util.Scanner;

public class Main {

        public static int minimumSum(int num) {
            // Your code goes here
            int oncePlace, tenPlace, hundredPlace, thousandPlace, result, count = 0, loop = 0, arr = 0, Secondresult;
            oncePlace = num / 1000;
            tenPlace = (num / 100) % 10;
            hundredPlace = (num / 10) % 10;
            thousandPlace = num % 10;
            int[] array = {oncePlace, tenPlace, hundredPlace, thousandPlace};
            while (loop < 3) {
                if (array[arr] <= 0) {
                    count++;
                }
                arr++;
                loop++;
            }
            if (count > 0) {
                java.util.Arrays.sort(array);
                int result1 = (array[0] * 10 + array[1]) + (array[2] * 10 + array[3]);
                result = result1;
                return result;
            } else {
                Secondresult = (array[0] * 10 + array[1]) + (array[2] * 10 + array[3]);
                return Secondresult;
            }
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(minimumSum(num));
    }
}