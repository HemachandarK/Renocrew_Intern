public class prac41qn6 {
    public static void main(String[] args) {
        //syntax error
        if(true){
            System.out.println("hi")
        }
        //logical error
        int l=10;
        int b=5;
        System.out.println("Area:"+l+b);
        //runtime error
        int r=0;
        System.out.println(l/r);
    }
}
