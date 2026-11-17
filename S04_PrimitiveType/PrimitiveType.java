public class PrimitiveType {
    public static void main(String[] args){
        // 基本型
        int i = 10;
        double d = 20.5;
        boolean b = true;
        char c = 'A';
        String s = "100";

        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);

        // 型変換
        System.out.println((double)i); // int -> double
        System.out.println((int)d); // double -> int
        System.out.println(Integer.parseInt(s)); // String -> int
    }
}
