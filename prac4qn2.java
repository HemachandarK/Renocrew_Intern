import java.util.Scanner;

public class prac4qn2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float s=(int)(a+b+c)*100/300;
        System.out.println(s);
        if(s>=40 && a>=33 && b>=33 && c>=33){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");

        }
    }
}
