class ElectricBill {
    double units;
    static double fixedCharge = 100;

    void calculate() {
        double bill;

        if (units <= 100)
            bill = units * 5;
        else if (units <= 200)
            bill = 100 * 5 + (units - 100) * 7;
        else
            bill = 100 * 5 + 100 * 7 + (units - 200) * 10;

        double total = bill + fixedCharge;
        System.out.println("Total Bill: " + total);
    }

    public static void main(String[] args) {
        ElectricBill e = new ElectricBill();
        e.units = 250;
        e.calculate();
    }
}