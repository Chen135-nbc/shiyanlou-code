public class demo6 {
    public static void main(String[] args) {
        double[] price = {20.0, 5.5, 12.3, 45.0, 100.0};
        int[] num = {2, 3, 1, 1, 5};
        double originalSum = 0;
        for(int i = 0 ; i < num.length ; i++){
            originalSum += price[i] * num[i];
        }
        if (originalSum > 1000){
            System.out.println("总价为：" + originalSum * 0.8);
        }else {
            System.out.println("总价为：" + originalSum * 0.9);
        }
    }
}
