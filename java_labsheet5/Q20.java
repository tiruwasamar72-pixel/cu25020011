class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }

    double calculateSalary() {
        return salary;
    }
}

interface Researcher {
    void conductResearch();
}

class Teacher extends Employee implements Researcher {
    private String subject;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    void teach() {
        System.out.println("Teaching " + subject);
    }

    public void conductResearch() {
        System.out.println("Teacher conducts research");
    }

    @Override
    double calculateSalary() {
        return getSalary() + 5000;
    }
}

class VisitingTeacher extends Teacher {
    private int hoursWorked;

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * 500;
    }
}

class Admin extends Employee {
    private String department;

    public void setDepartment(String department) {
        this.department = department;
    }

    void manageDepartment() {
        System.out.println("Managing " + department + " department");
    }
}

public class Q20 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setEmployeeId(101);
        t.setEmployeeName("Rahul");
        t.setSalary(50000);
        t.setSubject("Java");

        t.displayDetails();
        t.teach();
        t.conductResearch();
        System.out.println("Salary: " + t.calculateSalary());

        VisitingTeacher vt = new VisitingTeacher();
        vt.setEmployeeId(102);
        vt.setEmployeeName("Amit");
        vt.setSalary(0);
        vt.setSubject("Python");
        vt.setHoursWorked(40);

        vt.displayDetails();
        System.out.println("Salary: " + vt.calculateSalary());

        Admin a = new Admin();
        a.setEmployeeId(103);
        a.setEmployeeName("Neha");
        a.setSalary(45000);
        a.setDepartment("Administration");

        a.displayDetails();
        a.manageDepartment();
    }
}