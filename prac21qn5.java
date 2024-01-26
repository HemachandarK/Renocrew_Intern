public class prac21qn5 {
    public static void main(String args[]){
            int a[]=new int[5];
            a[0]=45;
            a[1]=3;
            a[2]=7;
            a[3]=8;
            a[4]=7;
            int m=a.length/2;
            int i=0,j=a.length-1;
            for(int k:a){
                System.out.print(k+",");
            }
            System.out.print('\n');
            while(i!=j){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;i++;j--;
            }            
            for(int k:a){
                System.out.print(k+",");
            }
    }
}
