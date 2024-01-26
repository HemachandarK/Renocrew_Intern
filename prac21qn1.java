public class prac21qn1{
    public static void main(String[] args){
        float a[]=new float[5];
        a[0]=1.2f;
        a[1]=3.45f;
        a[2]=7.54f;
        a[3]=8.432f;
        a[4]=7.543f;
        float s=0;
        for(int i=0;i<a.length;i++){
            s+=a[i];
        }
        System.out.println(s);
    }
}