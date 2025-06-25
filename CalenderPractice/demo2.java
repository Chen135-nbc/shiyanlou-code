import java.util.Calendar;
public class demo2 { //设置指定日期
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //设置2022年12月31日
        calendar.set(2022,Calendar.DECEMBER,31);
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        // 转换为常见星期表示
        String[] days = {"日", "一", "二", "三", "四", "五", "六"};
        System.out.println("2022年12月31日是星期" + days[weekday - 1] );
    }
}
