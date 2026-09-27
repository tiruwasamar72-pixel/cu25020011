class Employee {
    int empId;
    double salary;
    static String companyName = "ABC Company";

    void display() {
        int id = empId;
        double sal = salary;

        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + sal);
        System.out.println("Company: " + companyName);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.empId = 101;
        e.salary = 35000;
        e.display();
    }
}