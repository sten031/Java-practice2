/*・プリミティブ型の「long」「double」「boolean」の変数に値を代入して出力
　・ラッパークラスの「Float」「Integer」「Character」の変数に値を代入して出力
　・要素数が5の「int」配列に値を代入して、インデックス番号が3の値を出力*/

public class Chapter05 {
    public static void main(String[] args) {
        long l = 10000000000L;
        System.out.println(l);
        double d = 3.33;
        System.out.println(d);
        boolean b = true;
        System.out.println(b);

        Integer i = 123;
        System.out.println(i);
        Float f = 1.4133f;
        System.out.println(f);
        Character c = 'あ';
        System.out.println(c);

        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println(array[3]);
    }
}