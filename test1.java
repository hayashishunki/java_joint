package java_joint;

import java.util.Random;
import java.util.Scanner;

class test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("名前からあなたを占います");
		System.out.print("あなたのお名前は: ");
		String name = scanner.next();
		if (name != null) {
			int num = random.nextInt(4);
			System.out.println("こんにちは" + name + "さん");
			System.out.print("あなたの運勢は: ");
			switch (num) {
			case 0:
				System.out.println("大吉です");
				break;
			case 1:
				System.out.println("中吉です");
				break;
			case 2:
				System.out.println("吉です");
				break;
			default:
				System.out.println("凶です");
				break;
			}
		} else {
			System.out.println("エラーですよ");
		}

	}
}
