package curriculum_A;

public class Qes4 {
	public class Main {
	    public static void main(String[] args) {

	        byte byteVar = 10;
	        short shortVar = 1000;
	        int intVar = 100000;
	        long longVar = 10_000_000_000L;

	        float floatVar = 3.14f;
	        double doubleVar = 2.71828;

	        char charVar = 'a';
	        String stringVar = "ハロー";

	        boolean booleanVar = true;

	        int sum1 = byteVar + shortVar + intVar; 
	        System.out.println(sum1+sum1);
	        
	        int doubledByte = byteVar * 2;
	        System.out.println(doubledByte+ doubledByte);

	        System.out.println(charVar+stringVar+booleanVar+charVar+stringVar+booleanVar);

	        int sum2 = byteVar + shortVar + intVar + 120; 
	        System.out.println(11130+11130+"数字を全て足す");

	        System.out.println(String.format("%.0E", (double)longVar)+String.format("%.0E", (double)longVar)+ "小数点以外の数字を全てかける");

	        double result = 10.5 / 100;
	        System.out.println(result+result+"10.5割る100をする");

	        int result2 = byteVar - 100;
	        System.out.println(result2+result2 + "10引く100をする");
	    }
	}
}
