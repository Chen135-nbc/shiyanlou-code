import java.util.Calendar;
import java.util.Scanner;

public class demo7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scanner.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.DAY_OF_MONTH,1);

        int daysInYear = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
        if (daysInYear == 366){
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年不是闰年");
        }
    }
}
