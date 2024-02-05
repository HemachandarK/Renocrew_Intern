class c1 extends Thread{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Good Morning");i++;
        }
    }
}
public class prac41qn4 {
    public static void main(String[] args) {
        c1 a=new c1();
        System.out.println("STATE:"+a.getState());
        a.start();
        System.out.println("STATE:"+a.getState());
    }
}
