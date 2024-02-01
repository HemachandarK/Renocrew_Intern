abstract class pen{
    abstract void write();
    abstract void refill();
}

class fountainpen extends pen{
    public void changenib(){
        System.out.println("Nib Changed...");
    }
    public void write(){
        System.out.println("Writing...");
    }
    public void refill(){
        System.out.println("Refilling...");
    }
}
public class prac34qn2 {
    public static void main(String args[]){
        fountainpen a=new fountainpen();
        a.changenib();
        a.write();
        a.refill();
    }
}
