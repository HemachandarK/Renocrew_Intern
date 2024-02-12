public class prac41qn7 {
    static void sum(int a,int b){
        if(a>0){
            throw new  IllegalArgumentException();
        }
    }
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            System.out.println(a/b);
            sum(a,b);
        }
        catch(ArithmeticException e){
            System.out.println("HaHa");
        }
        catch(IllegalArgumentException e){
            System.out.println("HeHe");
        }
    }
}
