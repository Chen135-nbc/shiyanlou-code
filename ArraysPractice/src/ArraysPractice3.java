public class ArraysPractice3 {
    public static void main(String[] args) {
        //判断一个数组是否为“回文数组”
        int[] nums = {1, 2, 3, 2, 1};
        int n = nums.length; //n=5
        boolean isPalindrome = true;

        for (int i = 0; i < n/2 ; i++){
            if (nums[i] != nums[n-i-1]){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("是回文数组");
        }else{
            System.out.println("不是回文数组");
        }

    }
}
