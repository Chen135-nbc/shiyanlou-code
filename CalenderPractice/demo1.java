import java.util.Calendar;
public class demo1 { //基础题1：获取当前日期
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("今天是" + year + "年" + month + "月" + day + "日");
    }
}
