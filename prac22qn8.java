public class prac22qn8 {
    static void pat(int a,int s){
        if(s==0){
            return;
        }
        for(int j=0;j<=a-s;j++){
                System.out.print('*');
        }
        System.out.println();
        pat(a,--s);
    }
    public static void main(String args[]){
        pat(4,4);
    }
}
