class circle{
    int radius;
    public void setradius(int s){
        this.radius=s;
    }
    public void area(){
        float y=this.radius*this.radius*3.14f;
        System.out.println("Area:"+y);
    }
    public void perimeter(){
        float y=2*this.radius*3.14f;
        System.out.println("Perimeter:"+y);
    }
    
}
public class prac23qn6 {
    public static void main(String args[]){
        circle a=new circle();
        a.setradius(5);
        a.area();
        a.perimeter(); 
}
}
