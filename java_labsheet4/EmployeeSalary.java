class EmployeeSalary {
    String name;
    double salary;
    static String organization = "ABC Ltd";

    EmployeeSalary(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void compare(EmployeeSalary e) {
        double salary1 = salary;
        double salary2 = e.salary;

        if (salary1 > salary2)
            System.out.println(name + " has higher salary");
        else if (salary2 > salary1)
            System.out.println(e.name + " has higher salary");
        else
            System.out.println("Both have equal salary");

        System.out.println("Organization: " + organization);
    }

    public static void main(String[] args) {
        EmployeeSalary e1 = new EmployeeSalary("Rahul", 40000);
        EmployeeSalary e2 = new EmployeeSalary("Aman", 35000);

        e1.compare(e2);
    }
}