class Palindrome {
    static int countChecks = 0;

    void check(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        countChecks++;

        if (original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.check(121);
        System.out.println("Checks: " + countChecks);
    }
}