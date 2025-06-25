import java.util.Arrays;

public class demo1 { //中等难度：统计每个元素出现的次数
    public static void main(String[] args) {
        String[] arr = {"dog", "cat", "dog", "bird", "cat", "dog", "elephant"};
        int count = 1;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {
                count += 1;
            } else {
                System.out.println(arr[i-1] + "出现了" + count + "次");
                count = 1;
            }
        }
        System.out.println(arr[arr.length - 1] + "出现了" + count + "次" );
    }
}
