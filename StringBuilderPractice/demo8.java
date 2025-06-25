import java.util.Scanner;
//用户输入一个句子，要求将整个句子的单词顺序反转，但单词内容不变
public class demo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个句子：");
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        //分离句子中的每个单词
        String [] word = input.split(" ");
        //将String数组倒序排列
        for (int i = word.length-1; i >= 0; i--){
           result.append(word[i]);
           if (i > 0){
               result.append(" ");//// 在单词之间添加空格，最后一个单词不添加
           }
        }
        System.out.println(result);
    }
}
