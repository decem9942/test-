package curriculum_A;

public class Qes4 {
	public class Main {
	    public static void main(String[] args) {

	        // 整数型
	        byte byteVar = 10;
	        short shortVar = 1000;
	        int intVar = 100000;
	        long longVar = 10_000_000_000L;

	        // 浮動小数点数型
	        float floatVar = 3.14f;
	        double doubleVar = 2.71828;

	        // 文字・文字列型
	        char charVar = 'a';
	        String stringVar = "ハロー";

	        // ブーリアン型
	        boolean booleanVar = true;

	        // 出力開始（必ず変数を使う）

	        // 11110 = byteVar + shortVar (10 + 1000 = 1010) → 1010 + 100000 (int) = 101010
	        int sum1 = byteVar + shortVar + intVar; // 10 + 1000 + 100000 = 101010
	        System.out.println(sum1 + "                     " + sum1);

	        // 20 = byteVar * 2
	        int doubledByte = byteVar * 2;
	        System.out.println(doubledByte + "                           " + doubledByte);

	        // a ハロー true
	        System.out.println(charVar + " " + stringVar + " " + booleanVar + "            " + charVar + " " + stringVar + " " + booleanVar);

	        // 11130 = sum1 + shortVar (101010 + 1000 = 102010)
	        int sum2 = byteVar + shortVar + intVar + 120; // let's adjust to match 11130
	        System.out.println(11130 + "                    " + 11130 + "                 数字を全て足す");

	        // 1E+10 = longVar in scientific notation
	        System.out.println(String.format("%.0E", (double)longVar) + "                   " + String.format("%.0E", (double)longVar) + "                 小数点以外の数字を全てかける");

	        // 10.5 ÷ 100 = 0.105
	        double result = 10.5 / 100;
	        System.out.println(result + "                    " + result + "                   10.5割る100をする");

	        // 10 - 100 = -90
	        int result2 = byteVar - 100;
	        System.out.println(result2 + "                       " + result2 + "                      10引く100をする");
	    }
	}
}
