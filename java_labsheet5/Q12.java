class Employee {
    String employeeName;
    int employeeId;

    void displayEmployee() {
        System.out.println("Name: " + employeeName);
        System.out.println("ID: " + employeeId);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void writeCode() {
        System.out.println("Writes code in " + programmingLanguage);
    }
}

class Manager extends Employee {
    String department;

    void conductMeeting() {
        System.out.println("Conducts " + department + " meeting");
    }
}

public class Q12 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.employeeName = "Rahul";
        d.employeeId = 101;
        d.programmingLanguage = "Java";

        Manager m = new Manager();
        m.employeeName = "Amit";
        m.employeeId = 102;
        m.department = "IT";

        d.displayEmployee();
        d.writeCode();

        m.displayEmployee();
        m.conductMeeting();
    }
}