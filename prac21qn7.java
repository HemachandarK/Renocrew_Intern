public class prac21qn7 {
    public static void main(String args[]){
        int a[]=new int[5];
        a[0]=45;
        a[1]=3;
        a[2]=7;
        a[3]=8;
        a[4]=7;
        int m=Integer.MAX_VALUE;
        for(int k:a){
            if(k<m){
                m=k;
            }
        }
        System.out.print(m);
}
}
