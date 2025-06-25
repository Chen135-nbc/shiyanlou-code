import java.util.Scanner;

public class demo1 { //创建一个回文字符串
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        StringBuilder str = new StringBuilder(scanner.next());
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
        str.append(str1);
        System.out.println(str);

    }
}
