import java.util.Scanner;

public class task1 {
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("1ST SUBJECT");
        int a=sc.nextInt();
        System.out.println("2ND SUBJECT");
        int b=sc.nextInt();
        System.out.println("3RD SUBJECT");
        int c=sc.nextInt();
        System.out.println("4TH SUBJECT");
        int d=sc.nextInt();
        System.out.println("5TH SUBJECT");
        int e=sc.nextInt();
        float s=a+b+c+d+e;
        s/=5;
        System.out.println("PERCENTAGE:"+s);
    }
}
