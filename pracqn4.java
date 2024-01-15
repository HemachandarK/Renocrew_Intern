import java.util.Scanner;

public class pracqn4 {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER KILOMETER");
        float a=sc.nextFloat();
        float b=0.621371f;
        a=a*b;
        System.out.println("MILES:"+a);
    }
}
