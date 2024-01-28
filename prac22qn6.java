public class prac22qn6 {
    static int sum(int ...a){
        int s=0;
        for(int i:a){
            s+=i;
        }
        return s/a.length;
    }
    public static void main(String args[]){
        int c=sum(98,6,90,87,5);
        System.out.println(c);
    }
    
}
