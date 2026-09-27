import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] result = new int[n];
        int size = 0;

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean found = false;

            for (int j = 0; j < size; j++) {
                if (a[i] == result[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result[size] = a[i];
                size++;
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}