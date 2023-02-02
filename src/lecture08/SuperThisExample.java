package lecture08;

class Employee {
    protected int empNo;
    protected String empName;
    public Employee(int empNo, String empName) {
        this.empNo = empNo;
        this.empName = empName;
    }
}

class Developer extends Employee {
    private String position;

    public Developer(int empNo, String empName, String position) {
        super(empNo, empName);
        this.position = position;
    }

    public void printValues() {
        System.out.println("employee name: " + super.empName);
        System.out.println("employee no: " + super.empNo);
        System.out.println("position is: " + this.position);
    }
}

class SuperThisExample {
    public static void main(String[] args) {
        Developer developer1 = new Developer(222, "Manivanh", "CEO");
        developer1.printValues();
        Developer developer2 = new Developer(223, "Anouson", "CCO");
        developer2.printValues();
    }
}
