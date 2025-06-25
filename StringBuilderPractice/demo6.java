import java.util.Arrays;
import java.util.Scanner;
public class demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = scanner.nextLine();
        //删掉空格
        StringBuilder str = new StringBuilder(s);
        for (int j = 0; j < str.length(); j++){
            char c = str.charAt(j);
            if (c == ' '){
                str.deleteCharAt(j);
                j--;
            }
        }
        String input = str.toString();
        int count = 1; //记录当前字符出现的次数
        char[] charArray = input.toCharArray() ;
        Arrays.sort(charArray);

        for(int i = 1; i < charArray.length; i++){
            if (charArray[i-1] == charArray[i]){
                count++;
            }else {
                System.out.println(charArray[i-1] + ":" + count + "次");
                count=1;
            }
        }
        System.out.println(charArray[charArray.length-1] + ":" + count + "次");

    }
}


