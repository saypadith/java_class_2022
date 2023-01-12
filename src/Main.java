import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String s;
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader in= new  BufferedReader(ir);
        System.out.print("Enter your birth year:");
        try{
            s=in.readLine();
            int a = 2022 - Integer.parseInt(s) ;
            System.out.println("Your age is:  "+ a + " years old");
        }catch(IOException e){
            System.out.println("Read input keyboard error");
        }

    }
}