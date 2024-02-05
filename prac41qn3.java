class c1 extends Thread{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Good Morning");i++;
        }
    }
}
class c2 extends Thread{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Welcome");i++;
        }
    }
}
public class prac41qn3 {
    public static void main(String[] args) {
        c1 a=new c1();
        c2 b=new c2();
        long c=a.getPriority();
        long d=b.getPriority();
        System.out.println(c);
        System.out.println(d);
        b.setPriority(6);
        a.start();
        b.start();
    }
}
