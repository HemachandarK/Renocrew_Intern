import java.util.Scanner;

public class prac5qn5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();int s=1;
        for(int i=a;i>=1;i--){
            s*=i;
        }
        System.out.println(s);
    }
}
