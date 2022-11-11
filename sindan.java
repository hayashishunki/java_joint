package java_joint;

import java.util.Random;
import java.util.Scanner;

public class Sindan {
	
	public void Divination() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		Humans human = new Humans();
		
		System.out.println("占いをします。");
		System.out.print("何人占いますか？: ");
		int people = scanner.nextInt();
		for(int i = 1;i <= people;i++) {
			System.out.print("あなたのお名前は: ");
			human.setName(scanner.next());
			System.out.print(human.getName() + "さんの運勢は・・・");
			int rand = random.nextInt(4);
			human.setLuckResult(rand);
			switch(rand) {
			case 0:
				System.out.print("大吉");
				break;
			case 1:
				System.out.print("中吉");
				break;
			case 2:
				System.out.print("小吉");
				break;
			default :
				System.out.print("凶");
				break;
			}
			System.out.print("(" + human.getLuckNo() + ")\n");
		}	
		scanner.close();
	}
}
