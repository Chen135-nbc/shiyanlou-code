import java.util.Arrays;
public class demo3 {
    public static void main(String[] args) {
        int[] diceThrows = {1, 3, 4, 2, 5, 6, 1};
        boolean repeat = false;
        Arrays.sort(diceThrows);
        for (int i = 1; i < diceThrows.length; i++){
            if (diceThrows[i-1] == diceThrows[i]){
                repeat = true;
                break;
            }
        }
        if (repeat){
            System.out.println("有重复");
        }else{
            System.out.println("没有重复");
        }
    }
}
