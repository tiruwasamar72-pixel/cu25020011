class BankAccount {
    long accountNumber;
    double balance;
    static String bankName = "SBI";

    void deposit(double amount) {
        double depositAmount = amount;
        balance += depositAmount;
        System.out.println("Deposited: " + depositAmount);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountNumber = 123456;
        b.balance = 5000;
        b.deposit(2000);
        System.out.println("Bank: " + bankName);
    }
}