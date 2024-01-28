public class prac22qn7 {
    static void pat(int a){
        if(a==0){
            return;
        }
        for(int j=0;j<a;j++){
                System.out.print('*');
        }
        System.out.println();
        pat(--a);
    }
    public static void main(String args[]){
        pat(4);
    }
}
