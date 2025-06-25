import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
public class ArraysPractice2 {
    public static void main(String[] args) {
        //找出数组中第二大的元素
        int[] nums = {10, 20, 5, 8, 20};
        Arrays.sort(nums);  //[5, 8, 10, 20, 20]
        //去重
        Set<Integer> set = new LinkedHashSet<>();
        for (int n : nums){
            set.add(n);
        }
        //转成列表/数组方便按索引访问，因为Set本身没有索引
        //Java 的集合类（比如 Set、List）只能存放对象，不能存放基本类型
        Integer [] newNums = set.toArray(new Integer[0]);
        int secondMax = newNums[newNums.length-2];
        //打印倒数第二位，即第二大元素
        System.out.println("第二大元素是：" + secondMax);
    }
}
