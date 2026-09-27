import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        boolean[] visited = new boolean[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Frequency:");

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(a[i] + " = " + count);
        }

        sc.close();
    }
}