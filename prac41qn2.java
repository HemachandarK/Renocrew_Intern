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
            try{
                Thread.sleep(200);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class prac41qn2 {
    public static void main(String[] args) {
        c1 a=new c1();
        c2 b=new c2();
        a.start();
        b.start();
    }
}
