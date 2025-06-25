import java.util.Scanner;
public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入想查询的商品编号：");
        int n = scanner.nextInt();
        double[] prices = {10.0, 20.5, 15.0, 30.0, 50.0};
        if (n < prices.length){
            System.out.println(prices[n-1]);
        }else{
            System.out.println("商品不存在");
        }
    }
}
