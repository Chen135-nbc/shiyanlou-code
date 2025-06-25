import java.util.Arrays;
public class demo5 {
    // 找出数组中的最大和最小值
    public static void main(String[] args) {
        int[] numbers = {5, 10, 3, 8, 12, 7, 2};
        Arrays.sort(numbers);
        int min = numbers[0];
        int max = numbers[numbers.length-1];
        System.out.println("最小值为：" + min);
        System.out.println("最大值为：" + max);
    }
}

