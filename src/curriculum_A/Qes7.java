package curriculum_A;

public class Qes7 {
	public class Main {
	    public static void main(String[] args) {
	        // 『山田太郎 18歳 170.5cm 62.2kg 寿司』を変数に代入
	        String name = "山田太郎";
	        int age = 18;
	        double height = 170.5;
	        double weight = 62.2;
	        String food = "寿司";

	        // 自己紹介
	        System.out.println("初めまして" + name + "です");
	        System.out.println("年齢は" + age + "歳です");
	        System.out.println("身長は" + height + "cmです");
	        System.out.println("体重は" + weight + "kgです");
	        System.out.println("好きな食べ物は" + food + "です");

	        // BMIの計算（cm → m へ変換）
	        double heightInMeters = height / 100;
	        double bmi = weight / (heightInMeters * heightInMeters);

	        // BMIの出力
	        System.out.println("BMIは" + bmi + "です");
	    }
	}
}