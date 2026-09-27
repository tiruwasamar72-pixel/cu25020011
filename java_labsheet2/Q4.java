import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter visitors: ");
        int visitors = sc.nextInt();

        System.out.println("Visitors entering: " + (++visitors));
        System.out.println("Visitors leaving: " + (visitors--));
        System.out.println("Remaining visitors: " + visitors);

        sc.close();
    }
}