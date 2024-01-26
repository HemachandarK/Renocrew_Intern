public class prac21qn8 {
    public static void main(String args[]){
        int a[]=new int[5];
        a[0]=-5;
        a[1]=3;
        a[2]=4;
        a[3]=8;
        a[4]=77;
        int s=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<s){
                System.out.println("Not sorted");return;
            }
        }
        System.out.println("Sorted");
}
}
