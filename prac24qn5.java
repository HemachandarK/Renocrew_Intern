class sphere{
    private int radius;
    public void setrad(int r){
        this.radius=r;
    }
    public void getrad(){
        System.out.println("Radius:"+this.radius);
    }
}
public class prac24qn5 {
    public static void main(String args[]){
        sphere a=new sphere();
        a.setrad(5);
        a.getrad();
    }
}
