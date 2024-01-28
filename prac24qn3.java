class cylinder{
    private int radius;
    private int height;
    public cylinder(int r,int h){
        this.radius=r;
        this.height=h;
    }
    public void getrad(){
        System.out.println("Height:"+this.radius);
    }
    public void gethei(){
        System.out.println("Radius:"+this.height);
    }
}
public class prac24qn3 {
    public static void main(String args[]){
        cylinder a=new cylinder(5,10);
        a.gethei();
        a.getrad();
    }
}
