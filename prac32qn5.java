class phone{
    public phone(){
        System.out.println("This is Phone");
    }
}
class smartphone extends phone{
    public smartphone(){
        System.out.println("This is Smartphone");
    }
}
class aiphone extends smartphone{
    public aiphone(){
        System.out.println("This is aiphone");
    }
}
public class prac32qn5 {
    public static void main(String args[]){
        aiphone a=new aiphone();
    }
}
