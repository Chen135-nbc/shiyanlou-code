import java.util.Calendar;

public class demo4 { //基础题4.清空字段
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2025,Calendar.APRIL,26); //设置日期
        calendar.clear();
        System.out.println(calendar);
    }
}
