import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class prac45qn4 {
    public static void main(String[] args) {
        LocalDateTime a=LocalDateTime.now();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("HH:mm:ss");
        String t1=f.format(a);
        System.out.println(t1);
    }
}
