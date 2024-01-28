public class prac22qn10 {
    static int sum(int a){
        int s=0;
        for(int i=0;i<=a;i++){
            s+=i;
        }
        return s;
    }
    public static void main(String args[]){
        int c=sum(5);
        System.out.println(c);
    }
}
