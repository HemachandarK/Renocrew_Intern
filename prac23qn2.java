class cellphone{
    int model;
    String name;
    public void ring(){
        System.out.println("ringing..");
    }
    public void vib(){
        System.out.println("Vibrating..");
    }
    public void msg(){
        System.out.println("New Message..");
    }
    public void mus(){
        System.out.println("Start Music..");
    }
}
public class prac23qn2 {
    public static void main(String args[]){
        cellphone a=new cellphone();
        a.model=23;
        a.name="Apple";
        a.ring();
        a.msg();
        a.vib();
        a.mus();

    }
}
