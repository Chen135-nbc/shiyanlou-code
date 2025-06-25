public class demo4 { //替换子字符串
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello Java World");
        StringBuilder childStr = new StringBuilder("Python");
        str.replace(6,10,childStr.toString());
        System.out.println(str);
    }
}
