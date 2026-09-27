import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean powerOf4 = n > 0 && (n & (n - 1)) == 0 &&
                           (n & 0x55555555) != 0;

        if (powerOf4) {
            System.out.println("The number is a power of 4");
        } else {
            System.out.println("The number is not a power of 4");
        }

        int toggled = n ^ (1 << 2);

        System.out.println("After toggling the 3rd bit: " + toggled);
        System.out.println("Multiplication table:");

        for (int i = 1; i <= 20; i++) {
            int result = toggled * i;

            if (result % 6 == 0) {
                continue;
            }

            if (result % 48 == 0) {
                break;
            }

            System.out.println(toggled + " x " + i + " = " + result);
        }

        sc.close();
    }
}