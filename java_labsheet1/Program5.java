import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double n = sc.nextDouble();

        int x = (int) n;

        System.out.println("Original value: " + n);
        System.out.println("Converted value: " + x);
    }
}