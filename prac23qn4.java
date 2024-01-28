class rectangle{
    int length;
    int breadth;
    public void setdimention(int s,int q){
        this.length=s;
        this.breadth=q;
    }
    public void area(){
        int y=this.length*this.breadth;
        System.out.println("Area:"+y);
    }
    public void perimeter(){
        int y=2*(this.length+this.breadth);
        System.out.println("Perimeter:"+y);
    }
    
}
public class prac23qn4 {
    public static void main(String args[]){
        rectangle a=new rectangle();
        a.setdimention(2,3);
        a.area();
        a.perimeter(); 
}
}
