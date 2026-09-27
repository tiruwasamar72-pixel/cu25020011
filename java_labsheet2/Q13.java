import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        boolean vowel = ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' ||
                        ch == 'O' || ch == 'U';

        String result = (ch >= '0' && ch <= '9') ? "Digit"
                : ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
                ? (vowel ? "Vowel" : "Consonant")
                : "Special symbol";

        System.out.println(result);

        sc.close();
    }
}