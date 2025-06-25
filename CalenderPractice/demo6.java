import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class demo6 { //比较两个日期，打印出比较早的日期
    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.set(2023,Calendar.JANUARY,1);
        cal2.set(2025,Calendar.APRIL,26);
        int compare = cal1.compareTo(cal2);
        Date d1 = cal1.getTime();
        Date d2 = cal2.getTime();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");

        if (compare < 0){
            System.out.println("较早的日期为：" + s.format(d1) );
        }else if (compare > 0){
            System.out.println("较早的日期为：" + s.format(d2) );
        }else{
            System.out.println("两个日期相同：" + s.format(d1) );
        }
    }
}
