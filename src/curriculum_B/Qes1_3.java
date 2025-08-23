package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {
     public static void main() {
    	 Scanner scaner = new Scanner(System.in);
    	 
    	 System.out.print("ユーザー名を入力してください；");
		String userame = scannr.nextLIne();
    	 
		 if (username == null || username.trim().isEmpty()) {
	            System.out.println("名前を入力してください");
	        } else if (username.length() > 10) {
	            System.out.println("名前を10文字以内にしてください");
	        } else {
	            System.out.println("ユーザー名「" + username + "」を登録しました");
	        }

	        scanner.close();
	    }
	}
