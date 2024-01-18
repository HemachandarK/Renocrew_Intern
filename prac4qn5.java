import java.util.Scanner;

public class prac4qn5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter:");
        int a=sc.nextInt();
        if(a%100==0 && a%400==0){
            System.out.println("Leap year");
        }
        else if(a%4==0 && a%100!=0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not Leap year");
        }
    }
}
