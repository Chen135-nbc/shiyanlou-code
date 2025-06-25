import java.util.Arrays;
public class ArraysPractice5{
    public static void main(String[] args) {
        //请输出出现次数最多的元素，以及它的出现次数
        int[] nums = {1, 3, 2, 3, 4, 3, 2, 1, 1};

        //排序
        Arrays.sort(nums);

        int maxCount = 1; //出现最多的次数
        int count = 1; //当前数字重复的次数
        int maxNum = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(nums[i]==nums[i+1]){
                count++;
            }else{
                count = 1; //新的数，计数重置
            }


            if(count > maxCount){
                maxCount = count;
                maxNum = nums[i];
            }
        }
        System.out.println("出现次数最多的数字是：" + maxNum);
        System.out.println("它出现了：" + maxCount + " 次");
    }
}