import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 1;

        System.out.println("First 20 Fibonacci terms:");

        for (int i = 1; i <= 20; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}