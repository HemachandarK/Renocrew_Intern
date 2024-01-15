import java.util.Scanner;

public class pracqn2 {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("1ST SUBJECT");
        int a=sc.nextInt();
        System.out.println("2ND SUBJECT");
        int b=sc.nextInt();
        System.out.println("3RD SUBJECT");
        int c=sc.nextInt();
        float x=(float)a/100*10;
        float y=(float)b/100*10;
        float z=(float)c/100*10;
        float sum=x+y+z;
        sum=sum/3;
        System.out.print("CGPA:");
        System.out.println(sum);
    }
}
