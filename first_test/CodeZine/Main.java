package java_joint.first_test.CodeZine;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		int Random_num = rand.nextInt(4);

		System.out.println("0~3の中で乱数が生成されるので当ててみてください");
		int answer = scanner.nextInt();
		if(answer >= 4) {
			System.out.println("無効な値ですもう一度入力してください");
		} else if(answer == Random_num) {
			System.out.println("正解です！" + Random_num + "でした");
		} else {
			System.out.println("残念！もう一度入力してください");
		}
		
		while(answer != Random_num) {
			answer = scanner.nextInt();
			if(answer >= 4) {
				System.out.println("無効な値！もう一度！");
			} else if(answer == Random_num) {
				System.out.println("正解です！" + Random_num + 	"でした");
			} else {
				System.out.println("残念もう一度！");
			}
		}
		scanner.close();
	}

}
