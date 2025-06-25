public class demo5 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello World");
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c == ' '){
                str.deleteCharAt(i);
                i--; //删除字符后回退索引
            }
        }
        System.out.println(str);
    }
}
