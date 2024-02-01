class monkey{
    public void jump(){
        System.out.println("Jumping...");
    }
    public void bite(){
        System.out.println("Biting...");
    }
}
interface basicanimal{
    void eat();
    void sleep();
}
class human extends monkey implements basicanimal{
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
public class prac34qn5 {
    public static void main(String args[]){
        human a=new human();
        a.jump();
        a.eat();
    }
}
