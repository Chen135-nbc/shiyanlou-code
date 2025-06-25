import java.util.Scanner;
public class demo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份： ");
        int year = scanner.nextInt();
        if (year % 4 == 0){
            System.out.println(year + "年是闰年");
        }else{
            System.out.println(year + "年不是闰年");
        }
    }
}
