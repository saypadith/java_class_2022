package classA;

public class A1 {
    public int a1=1;
    protected int a2=2;
    int a3=3;
    private int a4=4;

    public double calculateBMI(double height, double weight){
        return weight / Math.pow(height, 2);
    }
}
