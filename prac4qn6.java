import java.util.Scanner;

public class prac4qn6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter:");
        String a=sc.nextLine();
        int c=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='.'){
                c=i;
            }
        }
        String b=a.substring(c,a.length());
        if(b.equals(".com")){
            System.out.println("Commercial Website");
        }
        else if(b.equals(".org")){
            System.out.println("Organization Website");
        }
        else if(b.equals(".in")){
            System.out.println("Indian Website");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
