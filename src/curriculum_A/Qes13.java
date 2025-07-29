package curriculum_A;

public class Qes13 {
	public class Main {
	    public static void main(String[] args) {
	        // 数値を文字列に変換
	        String ageStr = "18";
	        String heightStr = "170.5";

	        // 再び整数に変換
	        int age = Integer.parseInt(ageStr);
	        int height = (int) Double.parseDouble(heightStr);

	        // 条件判定（if文を使わず、論理式を直接出力）
	        System.out.println(age >= 25 || height >= 160);
	    }
	}
}
