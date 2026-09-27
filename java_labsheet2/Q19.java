import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Armstrong numbers between 1 and 1000:");

        for (int n = 1; n <= 1000; n++) {
            int temp = n;
            int digits = 0;
            int sum = 0;

            while (temp != 0) {
                digits++;
                temp /= 10;
            }

            temp = n;

            while (temp != 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == n) {
                System.out.print(n + " ");
            }
        }

        sc.close();
    }
}