import java.util.Scanner;

public class prac5qn6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();int s=1;
        while(a>=1){
            s*=a;
            a--;
        }
        System.out.println(s);
    }
}
