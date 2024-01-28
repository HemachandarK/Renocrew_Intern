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
        System.out.println("Radius:"+this.radius);
    }
    public void gethei(){
        System.out.println("Height:"+this.height);
    }
    public void getarea(){
        float s=2*3.14f*this.radius*this.height+2*3.14f*this.radius*this.radius;
        System.out.println("Surface Area:"+s);
    }
    public void getvol(){
        System.out.println("Volume:"+3.14f*this.radius*this.radius*this.height);
    }
}
public class prac24qn2 {
    public static void main(String args[]){
        cylinder a=new cylinder();
        a.setrad(5);
        a.sethei(10);
        a.gethei();
        a.getrad();
        a.getvol();
        a.getarea();
    }
}
