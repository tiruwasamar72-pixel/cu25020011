class BankAccountwd {
    double balance;
    static String bankCode = "SBI001";

    void withdraw(double amount) {
        double withdrawal = amount;

        if (withdrawal <= balance) {
            balance -= withdrawal;
            System.out.println("Withdrawal Successful");
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }

        System.out.println("Bank Code: " + bankCode);
    }

    public static void main(String[] args) {
        BankAccountwd b = new BankAccountwd();
        b.balance = 5000;
        b.withdraw(2000);
    }
}