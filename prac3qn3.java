public class prac3qn3 {
    public static void main(String[] args){
        String a="Dear <|name|>,Thanks a lot";
        String name="Hems";
        System.out.println(a);
        String b=a.replace("<|name|>",name);
        System.out.println(b);
    }
}
