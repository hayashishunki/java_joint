package java_joint;

import java.util.Random;
import java.util.Scanner;

public class Humans2 {
	Scanner scanner = new Scanner(System.in);
	Uranai2 uranai = new Uranai2();
	Random rand = new Random();

	public void printUranai() {
		System.out.print("あなたのお名前は？: ");
		uranai.setName(scanner.next());
		System.out.println("こんにちは" + uranai.getName() + "さん");
		System.out.print("あなたの運勢は: ");
		uranai.setValues(rand.nextInt(5));
		switch(uranai.getValues()) {
		case 0:
			System.out.println("大吉です");
			break;
		case 1:
			System.out.println("中吉です");
			break;
		case 2:
			System.out.println("小吉です");
			break;
		case 3:
			System.out.println("凶です");
			break;
		default :
			System.out.println("大凶です");
			break;
		}
	}

}
