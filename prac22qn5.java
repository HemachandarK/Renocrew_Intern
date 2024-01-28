public class prac22qn5 {
    static int s=0;
    static void fib(int a,int b,int t){
        if(t==2){
            System.out.println(s);
            return;
        }
        s=a+b;
        fib(b,s,t-1);
    }
    public static void main(String args[]){
        fib(0,1,9);
    }
}
