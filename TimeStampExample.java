import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStampExample {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Date date = new Date();
        System.out.println(sdf.format(timestamp));         // 2021-03-24 16:48:05
    }
}
