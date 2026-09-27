class PrimeChecker {
    static int totalPrimeChecks = 0;

    void check(int num) {
        boolean prime = true;

        if (num < 2)
            prime = false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        totalPrimeChecks++;

        if (prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }

    public static void main(String[] args) {
        PrimeChecker p = new PrimeChecker();
        p.check(17);
        System.out.println("Total Checks: " + totalPrimeChecks);
    }
}