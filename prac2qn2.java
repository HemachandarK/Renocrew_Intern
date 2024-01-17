import java.util.Scanner;

public class pracqn2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        int e=a+8;
        System.out.println("encrypted:"+(char)e);
        int d=e-8;
        System.out.println("decrypted:"+(char)d);
    }
}
