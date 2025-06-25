import java.util.Scanner;

public class demo3{
    //去除重复字符
    //使用 StringBuilder 遍历并删除重复字符。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        StringBuilder input = new StringBuilder(scanner.next());
        StringBuilder result = new StringBuilder(); //空

        for (int i = 0; i < input.length(); i++){ //遍历字符串

            char c = input.charAt(i); //获取当前遍历到的字符

            if(result.indexOf(String.valueOf(c)) == -1){ //检查字符c是否已经在字符串中存在

                //result.indexOf(...)
                //如果没有出现过（indexOf 返回 -1），追加到结果字符串。 如果已经出现过，跳过该字符
                result.append(c);
            }
        }

        System.out.println("去重后的字符串为：" + result);
    }
}

