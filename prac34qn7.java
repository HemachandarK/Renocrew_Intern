interface smarttvremote {
    void youtube();
}
interface tvremote extends smarttvremote {
    void on();
    void off();
}
class tv implements tvremote{
    @Override
    public void on(){
        System.out.println("On");
    }
    @Override
    public void off(){
        System.out.println("Off");
    }
    @Override
    public void youtube(){
        System.out.println("Youtube");
    }
}
public class prac34qn7 {
    public static void main(String args[]){
        tv a=new tv();
        a.on();
        a.off();
        a.youtube();
    }
}
