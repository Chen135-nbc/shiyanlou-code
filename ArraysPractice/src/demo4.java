public class demo4 {
    public static void main(String[] args) {
        double[] prices = {20.0, 5.5, 12.3};  // 商品价格
        int[] quantities = {2, 3, 1};  // 每个商品的购买数量
        double sum = 0;
        for (int i = 0; i < prices.length; i++){
            sum = sum + prices[i] * quantities[i];
        }
        System.out.println(sum);
    }
}
