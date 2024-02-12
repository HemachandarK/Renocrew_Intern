import java.util.Scanner;

class Myexception extends Exception{
    public String toString(){
        return "Max Retries Exception";
    }
}
public class prac41qn9 {
    public static void main(String[] args) {
        int i=1;
        while(true && i<=5){
            try{
                Scanner sc=new Scanner(System.in);
                int b=sc.nextInt();
                int a[]={1,2,3,4,5};
                System.out.println("Value:"+a[b]);
            }
            catch (Exception e){
                System.out.println("Attempt:"+i);
                i++;
            }
        }
        if(i>5){
            try{
                throw new Myexception();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
