import java.util.Scanner;

public class prac4qn3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter income in Lakhs:");
        float a=sc.nextFloat();
        if(a>=2.5 && a<5){
            System.out.println("5%");
        }
        else if(a>=5 && a<10){
            System.out.println("20%");
        }
        else if(a>=10){
            System.out.println("30%");
        }
        else{
            System.out.println("No tax");
        }
    }
}
