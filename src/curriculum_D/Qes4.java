package curriculum_D;

public class Qes4 {
	private int number; // フィールド

    public void Dog(int number) { // コンストラクタ
        this.number = number;
    }

    public int getNumber() { // メソッド（ゲッター）
        return number;
    }

    public void setNumber(int number) { // メソッド（セッター）
        this.number = number;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("動物の数：" + dog.getNumber());
    }
}

