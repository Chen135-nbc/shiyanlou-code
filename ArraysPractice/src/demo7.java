import java.util.Arrays;
public class demo7 {
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "David", "Eva"};
        int[] scores = {90, 95, 85, 70, 75};

        //// 创建一个与成绩对应的索引数组
        Integer[] sortedIndexes = new Integer[scores.length];
        for (int i = 0; i < scores.length; i++){
            sortedIndexes[i] = i;
        }

        //按成绩排序，降序排列
        Arrays.sort(sortedIndexes, (i1,i2) -> Integer.compare(scores[i2],scores[i1] ));

        for (int i = 0; i < sortedIndexes.length; i++) {
            String name = students[sortedIndexes[i]];
            int score = scores[sortedIndexes[i]];
            System.out.println(name + "第" + (i + 1) + "名" + score + "分");
        }
    }
}
