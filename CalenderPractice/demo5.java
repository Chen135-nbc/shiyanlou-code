import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class demo5 {
    public static void main(String[] args) {   //时间戳与日期转换
        Calendar calendar = Calendar.getInstance();
        long mill = calendar.getTimeInMillis();
        Date date = new Date(mill);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("格式化日期：" + sdf.format(date));
    }
}
