import java.util.Scanner;

class max extends Exception{
    public String toString(){
        return "Input Value Exceeded the limit 100000";
    }
}
class maxmul extends Exception{
    public String toString(){
        return "Input Value for Multiplication Exceeded the limit 7000";
    }
}
class divby0 extends Exception{
    public String toString(){
        return "Divided By Zero Exception";
    }
}
class invalidinput extends Exception{
    public String toString(){
        return "Input Value for the operation is Invalid";
    }
}
public class task41qn1 {

    public static void add(int a,int b){
        int c=a+b;
        System.out.println("Answer:"+c);
    }
    public static void sub(int a,int b){
        int c=a-b;
        System.out.println("Answer:"+c);
    }
    public static void mul(int a,int b){
        System.out.println("Answer:"+a*b);
    }
    public static void div(int a,int b){
        System.out.println("Answer:"+a/b);
    }
    public static void main(String[] args) {
        System.out.println("Enter:\n1-Addition\n2-substraction\n3-Multiplication\n4-Division\n5-Exit\n");
        Scanner sc=new Scanner(System.in);
        int x=1;
        while(x==1){
            int n=sc.nextInt();
            System.out.println("Enter the Number-1:");
            int a=sc.nextInt();
            System.out.println("Enter the Number-2:");
            int b=sc.nextInt();
            if(a>100000 || b>100000){
                try{
                    throw new max();
                }
                catch(Exception e){
                    System.out.println(e);
                    continue;
                }
            }
            switch (n) {
                case 1:
                    add(a,b);
                    break;
                case 2:
                    sub(a,b);
                    break;
                case 3:
                    if(a>7000 || b>7000){
                        try{
                            throw new maxmul();
                        }
                        catch(Exception e){
                            System.out.println(e);
                        }
                        break;
                    }
                    mul(a,b);
                    break;
                case 4:
                if(b==0){
                    try{
                        throw new divby0();
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                    break;
                }
                    div(a,b);
                    break;
                case 5:
                    x=0;
                    break;
                default:
                    try{
                        throw new invalidinput();
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                    break;
            }
        }
    }
}
