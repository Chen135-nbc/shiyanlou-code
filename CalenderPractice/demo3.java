import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class demo3 { //基础题3.日期加减计算
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); //获取当前时间
        calendar.add(Calendar.DAY_OF_MONTH,10); //日期加减
        Date date = calendar.getTime();
        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = sdf.format(date);
        System.out.println("十天后的日期是" + formattedDate);
    }
}
