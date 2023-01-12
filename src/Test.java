public class Test {
    static int withdrawMoney = 90000;
    static int atLeast = 100000;
    static int minimum = 50000;
    public static void main(String[] args) {
        if (withdrawMoney >= atLeast)
            if (withdrawMoney % minimum == 0)
                System.out.println("Complete");
            else
                System.out.println("Failed, please enter the correct number");
        else System.out.println("Please enter the number greater than " + atLeast);
    }
}
