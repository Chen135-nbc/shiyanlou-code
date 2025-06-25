import java.util.Scanner;

public class demo7 { //用户输入一句话，要求对其中的每个单词进行反转，单词顺序保持不变
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一句话：");
        String s = scanner.nextLine();
        StringBuilder str = new StringBuilder();

        //用split()方法提取句子中的单词到数组
        // 使用正则表达式 "\\W+" 按非单词字符分割字符串
        String [] word =s.split("\\W+");

        //循环，把每个单词单独反转后，加入str里
        for (int i = 0 ; i < word.length; i++){
            StringBuilder newStr = new StringBuilder(word[i]);
            newStr.reverse();
            str.append(newStr + " ");
        }
        System.out.println(str);
    }
}