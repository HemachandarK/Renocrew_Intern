public class prac22qn4 {
    static void pat(int a){
        for(int i=a;i>=0;i--){
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
