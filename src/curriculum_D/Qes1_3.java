import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

package curriculum_D;

//Q1：Dogクラスを呼び出して変数に代入し、動物の名前を出力
Dog dog1 = new Dog( "ポチ", 3);
System.out.println( "動物の名前 ：" + dog1.getName());

// Q2：動物の数を出力
System.out.println("動物の数：" + dog1.getNumber());

// Q3：現在の日時を「yyyy-MM-dd H:m:s」形式で出力
LocalDateTime now = LocalDateTime.now();
DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
String formattedDate = now.format(fmt);
System.out.println("現在の日時：" + formattedDate);
    }
  }

class Dog {
private String name;  // フィールド（名前）
private int number;   // フィールド（動物の数）

// コンストラクタ
public Dog(String name, int number) {
this.name = name;
this.number = number;
}

public Dog() {
}

// ゲッター
public String getName() {
return name;
}

public int getNumber() {
return number;
}

// セッター
public void setName(String name) {
this.name = name;
}

public void setNumber(int number) {
this.number = number;
}
}