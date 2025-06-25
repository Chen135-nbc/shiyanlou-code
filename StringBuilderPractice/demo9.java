import java.util.Scanner;
//用户输入一个字符串，将字符串中的每个单词的首尾字符互换。
public class demo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = scanner.nextLine();
        StringBuilder result  = new StringBuilder();
        //分离出单个单词
        String[]  s = input.split(" ");
        //每个单词进行单独操作
        for (int i = 0; i < s.length; i++){
            char[] c = s[i].toCharArray(); //把单词转换为字符数组处理
            char newC = c[0];
            c[0] = c[c.length-1];
            c[c.length-1] = newC; //把首尾字母调换
            result.append(c);
            if (i < s.length -1){
                result.append(" ");
            }
        }
        System.out.println(result);
    }
}
