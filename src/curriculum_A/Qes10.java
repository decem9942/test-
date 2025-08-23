package curriculum_A;

public class Qes10 {
	public class Main {
	    public static void main(String[] args) {
	        // []で与えられた情報を変数に代入
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

	        // 年齢が25歳以上かを出力（if文を使わず直接ブール式）
	        System.out.println(age >= 25);
	    }
	}
}
