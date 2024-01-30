class rectangle{
    private int l;
    private int b;
    public rectangle(){
        System.out.println("This is Rectangle");
    }
    public void set(int l,int b){
        this.l=l;
        this.b=b;
        area();
    }
    public void area(){
        int y=this.l*this.b;
        System.out.println("Area:"+y);
    }
}
class cuboid extends rectangle{
    public cuboid(int l,int b,int h){
        System.out.println("Volume:"+l*b*h);
    }
}
public class prac32qn4 {
    public static void main(String args[]){
        cuboid a=new cuboid(5,6,7);
        a.set(5,6);
    }
}
