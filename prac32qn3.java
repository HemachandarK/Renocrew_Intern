class circle{
    private int r;
    public circle(){
        System.out.println("This is Circle");
    }
    public circle(int r){
        this.r=r;
        area();
    }
    public void area(){
        double a=Math.PI*this.r*this.r;
        System.out.println("Area:"+a);
    }
}
class cylinder extends circle{
    public cylinder(int r,int h){
        super(r);
        double a=Math.PI*r*r*h;
        System.out.println("Volume:"+a);
    }
}
public class prac32qn3 {
    public static void main(String args[]){
        cylinder a=new cylinder(3,4);
    }
}
