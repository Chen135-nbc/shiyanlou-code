import java.util.Arrays;
//统计每个元素出现的次数（进阶版）
public class ArraysPractice1 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 5, 4, 3, 6, 6, 6};
        Arrays.sort(nums);
        int count = 1; //记录当前数字出现的次数
        for (int i = 1; i < nums.length; i++){
            if (nums[i-1] == nums[i]){
                count++;    //如果相邻两个数字相同，count+1

            }else{
                //在遇到 新的数字 的时候，打印前面那个数字的计数结果。
                System.out.println(nums[i-1] +"出现了" + count +"次");
                count = 1;
            }

        }
        System.out.println(nums[nums.length -1 ] + "出现了" + count + "次");
    }
}
