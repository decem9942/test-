package curriculum_A;

public class Qes12 {
	public class Main {
	    public static void main(String[] args) {
	        // 元の数値
	        int age = 18;
	        double height = 170.5;

	        // 文字列に変換
	        String ageStr = String.valueOf(age);
	        String heightStr = String.valueOf(height);

	        // 年齢を整数型に戻す
	        int ageInt = Integer.parseInt(ageStr);

	        // 身長はdoubleなので、いったんdouble型に変換してからintにキャスト
	        int heightInt = (int) Double.parseDouble(heightStr);

	        // 出力
	        System.out.println("年齢（整数）: " + ageInt);
	        System.out.println("身長（整数）: " + heightInt);
	    }
	}
}
