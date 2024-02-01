abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class Smarttelephone extends Telephone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void lift(){
        System.out.println("Lifting...");
    }
    public void disconnect(){
        System.out.println("Disconnecting...");
    }
}
public class prac34qn4 {
    public static void main(String args[]){
        Smarttelephone a=new Smarttelephone();
        a.ring();
    }
}
