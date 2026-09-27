import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter lower range: ");
        int lower = sc.nextInt();

        System.out.print("Enter upper range: ");
        int upper = sc.nextInt();

        boolean leap = (year % 400 == 0) ||
                       (year % 4 == 0 && year % 100 != 0);

        if (leap && year >= lower && year <= upper) {
            System.out.println("Leap year within range");
        } else {
            System.out.println("Condition not satisfied");
        }

        sc.close();
    }
}