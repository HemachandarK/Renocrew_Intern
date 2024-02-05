class c1 extends Thread{
    public void run(){
        Thread a= Thread.currentThread();
        System.out.println(a.getName());
        System.out.println(a.getState());
        int i=0;
        while(i<10){
            System.out.println("Good Morning");i++;
        }
    }
}
public class prac41qn5 {
    public static void main(String[] args) {
        c1 a=new c1();
        a.start();
    }
}
