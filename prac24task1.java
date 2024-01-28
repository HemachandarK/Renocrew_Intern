import java.util.Random;
import java.util.Scanner;

class guessgame {
    private int x;
    private int d;
public guessgame(){
    Random r=new Random();
    this.x=r.nextInt(10)+1;
}
public void iscorrectnumber(int a){
    if(x==a){
        System.out.println("Correct");
        this.getnum();
    }
    else{
        if(a>x){
            System.out.println("Your Guess is high");d++;
            this.setnum();
        }
        else{
            System.out.println("Your Guess is Low");d++;
            this.setnum();
        }
    }
}
public void getnum(){
    System.out.println("No. of Times:"+d);
}
public void setnum(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number 0-10:");
    int y=sc.nextInt();
    this.iscorrectnumber(y);
} 
}
public class prac24task1 {
    public static void main(String args[]){
        guessgame a=new guessgame();
        a.setnum();
    }
}
