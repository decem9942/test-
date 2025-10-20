package curriculum_D;

public class Qes1 {
	private String name; // フィールド

    public void Dog(String name) { // コンストラクタ
        this.name = name;
    }

    public String getName() { // メソッド（ゲッター）
        return name;
    }

    public void setName(String name) { // メソッド（セッター）
        this.name = name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("ポチ", 0);
        System.out.println("動物の名前：" + dog.getName());
    }
}