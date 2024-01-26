import java.util.Scanner;
public class prac21qn2 {
    public static void main(String[] args){
        int a[]=new int[5];
        a[0]=45;
        a[1]=3;
        a[2]=7;
        a[3]=8;
        a[4]=7;
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(s==a[i]){
                System.out.println("found at "+i);return;
            }
        }
        System.out.println("not found");
    }
}
