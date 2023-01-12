package lecture03.encapsulation;

public class Test {

  public static void main(String[] args) {
    Student s = new Student();

    s.setName("Savath");
    s.setAge(20);
    System.out.println(s.getName() + " " + s.getAge());

    s.setName("James");
    s.setAge(25);
    System.out.println(s.getName() + " " + s.getAge());
  }
}
