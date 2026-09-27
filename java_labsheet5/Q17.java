interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class MultiFunctionMachine implements Printer, Scanner {
    private String machineName;
    private int machineId;

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public String getMachineName() {
        return machineName;
    }

    public int getMachineId() {
        return machineId;
    }

    public void print() {
        System.out.println("Printing");
    }

    public void scan() {
        System.out.println("Scanning");
    }
}

public class Q17 {
    public static void main(String[] args) {
        MultiFunctionMachine m = new MultiFunctionMachine();

        m.setMachineName("HP Printer");
        m.setMachineId(101);

        System.out.println("Machine: " + m.getMachineName());
        System.out.println("ID: " + m.getMachineId());

        m.print();
        m.scan();
    }
}