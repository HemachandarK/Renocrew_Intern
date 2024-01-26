public class prac21qn4 {
    public static void main(String[] args){
        int a[][]=new int[2][3];
        a[0][0]=45;
        a[0][1]=3;
        a[0][2]=7;
        a[1][0]=5;
        a[1][1]=13;
        a[1][2]=73;
        int b[][]=new int[2][3];
        b[0][0]=45;
        b[0][1]=3;
        b[0][2]=7;
        b[1][0]=5;
        b[1][1]=13;
        b[1][2]=73;
        int c[][]=new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }   
}
