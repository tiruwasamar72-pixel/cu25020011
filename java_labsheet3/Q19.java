import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter size of row " + (i + 1) + ": ");
            int n = sc.nextInt();

            a[i] = new int[n];

            System.out.println("Enter elements:");

            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Jagged array:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}