public class prac22qn3 {
    static int sum(int a){
        if(a==0){
            return a;
        }
        return a+sum(a-1);
    }
    public static void main(String args[]){
        int c=sum(5);
        System.out.println(c);
    }
}
