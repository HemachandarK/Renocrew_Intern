class rectangle{
    private int length;
    private int breadth;
    public rectangle(){
        this.length=4;
        this.breadth=5;
    }
    public rectangle(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    public void getlen(){
        System.out.println("Length:"+this.length);
    }
    public void getbr(){
        System.out.println("Breadth:"+this.breadth);
    }
}
public class prac24qn4 {
    public static void main(String args[]){
        rectangle a=new rectangle();
        a.getlen();
        a.getbr();
    }
}
