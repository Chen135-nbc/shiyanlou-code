import java.util.Scanner;
//重复字符串
public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串str：");
        String str = scanner.next();
        System.out.println("请输入一个数字n：");
        int n = scanner.nextInt();
        StringBuilder newStr = new StringBuilder(str);
        for (int i = 1; i < n; i++){
            newStr.append(str);
        }
        System.out.println(newStr);
    }
}
