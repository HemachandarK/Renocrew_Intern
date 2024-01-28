class cylinder{
    private int radius;
    private int height;
    public void setrad(int r){
        this.radius=r;
    }
    public void sethei(int h){
        this.height=h;
    }
    public void getrad(){
        System.out.println("Height:"+this.radius);
    }
    public void gethei(){
        System.out.println("Radius:"+this.height);
    }
}
public class prac24qn1 {
    public static void main(String args[]){
        cylinder a=new cylinder();
        a.setrad(5);
        a.sethei(10);
        a.gethei();
        a.getrad();
    }
}
