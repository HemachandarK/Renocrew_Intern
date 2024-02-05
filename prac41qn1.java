class c1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }
}
class c2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome");
        }
    }
}
public class prac41qn1 {
    public static void main(String[] args) {
        c1 a=new c1();
        c2 b=new c2();
        a.start();
        b.start();
    }
}
