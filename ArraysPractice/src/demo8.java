import java.util.Scanner;
public class demo8 {
    //你需要计算多个商品的总价，但你不需要计算所有商品的价格，只需要计算一部分商品的总价。
    public static void main(String[] args) {
        double[] price = {20.0, 5.5, 12.3, 45.0, 100.0}; //商品价格
        int [] num = {2, 3, 1, 1, 5}; //商品数量

        //做个调整，由用户输入要计算的商品编号，这里我们还是固定选择3个商品
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要计算的第1个商品编号(范围1-5)：");
        int n1 = scanner.nextInt();
        System.out.println("请输入要计算的第2个商品编号(范围1-5)：");
        int n2 = scanner.nextInt();
        System.out.println("请输入要计算的第3个商品编号(范围1-5)：");
        int n3 = scanner.nextInt();

        double sum;
        if(n1 <= num.length && n2 <= num.length && n3 <= num.length && n1 != n2 && n1 !=n3 && n2!=n3){
            sum = price[n1-1] * num[n1-1] +price[n2-1] * num[n2-1] +price[n3-1] * num[n3-1];
        }else{
            System.out.println("输入错误");
            return;
        }
        System.out.println("总价为：" + sum);
    }
}
