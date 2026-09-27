import java.util.Scanner;

public class Program25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.print("Enter logical operator (&& or ||): ");
        String op = sc.next();

        boolean x = a != 0;
        boolean y = b != 0;

        if (op.equals("&&"))
            System.out.println("Result: " + (x && y));
        else if (op.equals("||"))
            System.out.println("Result: " + (x || y));
        else
            System.out.println("Invalid Logical Operator");
    }
}