import java.util.Scanner;
import java.util.Random;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number;

        while (true) {
            number = random.nextInt(100) + 1;
            System.out.println("Generated number: " + number);

            if (number % 7 == 0 && number % 13 == 0) {
                System.out.println("Number divisible by both 7 and 13: " + number);
                break;
            }
        }

        sc.close();
    }
}