import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int zero = 0;
        int nonZero = 0;

        System.out.println("Enter elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();

                if (a[i][j] == 0) {
                    zero++;
                } else {
                    nonZero++;
                }
            }
        }

        if (zero > nonZero) {
            System.out.println("Matrix is a sparse matrix");
        } else {
            System.out.println("Matrix is not a sparse matrix");
        }

        sc.close();
    }
}