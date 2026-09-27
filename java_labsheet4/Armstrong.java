class Armstrong {
    static int totalChecks = 0;

    void check(int num) {
        int original = num;
        int temp = num;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        totalChecks++;

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }

    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        a.check(153);
        System.out.println("Checks: " + totalChecks);
    }
}