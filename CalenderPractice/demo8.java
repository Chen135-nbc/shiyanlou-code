import java.text.SimpleDateFormat;
import java.util.Calendar;

public class demo8 {
    public static void main(String[] args) { //获取一周的第一天和最后一天
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);

        //获取本周第一天
        calendar.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd");
        String firstDay = s1.format(calendar.getTime());

        calendar.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
        String lastDay = s1.format(calendar.getTime());

        System.out.println("本周第一天：" + firstDay);
        System.out.println("本周最后一天：" + lastDay);


    }
}
