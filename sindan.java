package java_joint;

import java.util.Random;
import java.util.Scanner;

public class sindan {

	public static void main(String[] args) {
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
			int rand = random.nextInt(10);
			switch(rand) {
			case 0:
				System.out.println("大吉");
				break;
			case 1:
				System.out.println("中吉");
				break;
			case 2:
				System.out.println("小吉");
				break;
			default :
				System.out.println("凶");
				break;
			}
		}	
		scanner.close();
	}

}
/** 
 * 
 * 使用書
 * 
 * ランダムな値を用意(10個のランダム数字)
 * ランダム値を人数分用意(ランダム数値が０だった場合は大吉, １中吉, ２小吉, ３凶)
 * 結果
 * 何々さんの名前・・・を出力する。
 * 占いに来た人数分入力します
 * 人数分の個情報を入力させて、インスタンス化させます
 * 
 * */