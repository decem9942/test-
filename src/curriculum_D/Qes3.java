package curriculum_D;

public class Qes3 {
	  private String name; // フィールド

	    public void Dog() { // コンストラクタ
	        this.name = "犬";
	    }

	    public String getName() { // メソッド（ゲッター）
	        return name;
	    }

	    public void setName(String name) { // メソッド（セッター）
	        this.name = name;
	    }

	    public static void main(String[] args) {
	        Dog dog = new Dog();
	        System.out.println("動物の名前：" + dog.getName());
	    }
	}