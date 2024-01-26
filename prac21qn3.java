
public class prac21qn3 {
    public static void main(String[] args){
        int a[]=new int[5];
        a[0]=45;
        a[1]=3;
        a[2]=7;
        a[3]=8;
        a[4]=7;
        int s=0;
        for(int i:a){
            s+=i;
        }
        s/=5;
        System.out.println("avg:"+s);
    }
}
