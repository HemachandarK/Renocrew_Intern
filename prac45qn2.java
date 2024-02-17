import java.text.SimpleDateFormat;
import java.util.Date;
public class prac45qn2 {
    public static void main(String[] args) {
        Date a=new Date();
        SimpleDateFormat b=new SimpleDateFormat("HH:mm:ss");
        String time=b.format(a);
        System.out.println(time);
    }
}
