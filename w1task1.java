import java.util.Scanner;
public class w1task1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean n=true;
        System.out.println("Earn 5 Points to win");
        int x=0,y=0;
        while(n){
            System.out.println("Player A:Enter 1 for Rock 2 for paper 3 for scissor:");
            int a=sc.nextInt();
            System.out.println("Player B:Enter 1 for Rock 2 for paper 3 for scissor:");
            int b=sc.nextInt();
            if(a==b){
                System.out.println("No points");
            }
            else if(a==1&&b==2){
                System.out.println("Player B wins");y++;
            }
            else if(a==1&&b==3){
                System.out.println("Player A wins");x++;
            }
            else if(a==2&&b==1){
                System.out.println("Player A wins");x++;
            }
            else if(a==2&&b==3){
                System.out.println("Player B wins");y++;
            }
            else if(a==3&&b==1){
                System.out.println("Player B wins");y++;
            }
            else if(a==3&&b==2){
                System.out.println("Player A wins");x++;
            }
            if(x>=5 || y>=5){
                if(x>=5){
                    System.out.println("Player A won the game");break;
                }
                else{
                    System.out.println("Player B won the game");break;
                }
            }

        }
    }
}
