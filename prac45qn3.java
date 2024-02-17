
import java.util.Calendar;

public class prac45qn3 {
    public static void main(String[] args) {
        Calendar a=Calendar.getInstance();
        int h=a.get(Calendar.HOUR_OF_DAY);
        int m=a.get(Calendar.MINUTE);
        int s=a.get(Calendar.SECOND);
        System.out.println(h+":"+m+":"+s);
    }
}
