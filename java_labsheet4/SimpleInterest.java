class SimpleInterest {
    double principal, rate, time;
    static String bank = "SBI";

    void calculate() {
        double interest = (principal * rate * time) / 100;

        System.out.println("Bank: " + bank);
        System.out.println("Simple Interest: " + interest);
    }

    public static void main(String[] args) {
        SimpleInterest s = new SimpleInterest();
        s.principal = 10000;
        s.rate = 5;
        s.time = 2;
        s.calculate();
    }
}