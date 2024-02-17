import java.util.Scanner;
import java.util.ArrayList;
class prac45qn1{
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            String n=sc.nextLine();
            a.add(n);
        }
        System.out.println("Names:");
        for(String i: a){
            System.out.println(i);
        }
    }
}