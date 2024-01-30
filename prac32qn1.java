class circle{
    public circle(){
        System.out.println("This is Circle");
    }
}
class cylinder extends circle{
    public cylinder(){
        System.out.println("This is Cylinder");
    }
}
public class prac32qn1 {
    public static void main(String args[]){
        cylinder a=new cylinder();
    }
}
