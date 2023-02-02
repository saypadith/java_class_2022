package lecture08;


class Person {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String gender;

    public Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
}

class Student extends Person {
    private int studentId;

    public Student(String firstName, String lastName, int age, String gender, int studentId) {
        super(firstName, lastName, age, gender);
        this.studentId = studentId;
    }

    public void showStudentDetail(){
        System.out.println("Firstname: " + super.firstName);
        System.out.println("ID: " + this.studentId);
    }
}

class Teacher extends Person {
    private int salary;

    public Teacher(String firstName, String lastName, int age, String gender, int salary) {
        super(firstName, lastName, age, gender);
        this.salary = salary;
    }

    public void showTecherDetail(){
        System.out.println("Firstname: " + super.firstName);
        System.out.println("Salary: " + this.salary);
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student("John", "Doe", 20, "Male", 12345);
        Teacher t = new Teacher("Jane", "Doe", 35, "Female", 50000);
        s.showStudentDetail();
        t.showTecherDetail();
    }
}

