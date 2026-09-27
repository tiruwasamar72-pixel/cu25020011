import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        System.out.println("Enter five numbers:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];
        int min = a[0];

        for (int n : a) {
            if (n > max) {
                max = n;
            }

            if (n < min) {
                min = n;
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

        sc.close();
    }
}