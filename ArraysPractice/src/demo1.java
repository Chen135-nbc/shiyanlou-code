import java.util.Arrays;
public class demo1 { //成绩排序
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 95, 88, 73, 91, 84, 76};
        Arrays.sort(scores);
        int n = scores.length;
        int [] arr = Arrays.copyOfRange(scores,n-3,n);
        System.out.println(Arrays.toString(arr));
    }
}
