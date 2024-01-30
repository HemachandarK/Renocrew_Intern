class rectangle{
    private int l;
    private int b;
    public rectangle(){
        System.out.println("This is Rectangle");
    }
    public rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
}
class cuboid extends rectangle{
    public cuboid(int l,int b){
        super(l,b);
        System.out.println("This is Cuboid");
    }
}
public class prac32qn2 {
    public static void main(String args[]){
        cuboid a=new cuboid(5,6);
    }
}
