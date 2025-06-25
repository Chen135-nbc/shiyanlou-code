import java.util.Arrays;
import java.util.Scanner;

public class demo6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = scanner.nextLine().replace(" ","");//删除空格
        countCharFrequency(s);
    }
    public static void  countCharFrequency(String input){
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        int count = 1;

        for (int i = 1; i < charArray.length; i++){
            if (charArray[i-1] == charArray[i]){
                count++;
            }else {
                System.out.println(charArray[i-1] + ":" + count);
            }
        }
        System.out.println(charArray[charArray.length-1] + ":" +count );


    }
}
