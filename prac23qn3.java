class square{
    int side;
    public void setside(int s){
        this.side=s;
    }
    public void area(){
        int y=this.side*this.side;
        System.out.println("Area:"+y);
    }
    public void perimeter(){
        int y=4*this.side;
        System.out.println("Perimeter:"+y);
    }
    
}
public class prac23qn3 {
        public static void main(String args[]){
            square a=new square();
            a.setside(5);
            a.area();
            a.perimeter(); 
    }
    
}
