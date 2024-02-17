import java.util.Scanner;
import java.util.HashSet;
public class prac45qn5 {
    public static void main(String[] args) {
        HashSet<Integer> a=new HashSet<>();
        int arr[]={3,4,5,3,6,4,3,7,45,3,8};
        for(int i=0;i<arr.length;i++){
            a.add(arr[i]);
        }
        for(int i:arr){
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println(a);
    }
}
