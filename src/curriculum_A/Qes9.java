package curriculum_A;

public class Qes9 {
	public class Main {
	    public static void main(String[] args) {
	        // 初期値を設定
	        String name = "鈴木一郎";
	        int age = 18;
	        double height = 170.5;
	        double weight = 62.2;
	        String food = "オムライス";

	        // 数値を和算で自己代入
	        age += 30;          // 18 + 30 = 48
	        height += 166.5;    // 170.5 + 166.5 = 337.0
	        weight += 66.2;     // 62.2 + 66.2 = 128.4

	        // 自己紹介
	        System.out.println("初めまして" + name + "です");
	        System.out.println("年齢は" + age + "歳です");
	        System.out.println("身長は" + height + "cmです");
	        System.out.println("体重は" + weight + "kgです");
	        System.out.println("好きな食べ物は" + food + "です");

	        // BMI計算（cm→mに変換）
	        double heightInMeters = height / 100;
	        double bmi = weight / (heightInMeters * heightInMeters);

	        // BMIを小数点第2位まで表示
	        System.out.printf("BMIは%.2fです%n", bmi);
	    }
	}
}
