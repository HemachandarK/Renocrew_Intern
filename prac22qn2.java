public class prac22qn2 {
    static void pat(int a){
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pat(4);
    }
}
