package java_joint.first_test;

import java.util.Scanner;

public class Work {

	public void printMan() {
		Scanner scanner = new Scanner(System.in);
		Humans human = new Humans();
		
		System.out.print("あなたの名前は？: ");
		human.setName(scanner.next());
		System.out.print("あなたの年齢は: ");
		human.setAge(scanner.nextInt());
		System.out.println("あなたの誕生日は？: ");
		human.setBirsday(scanner.next());
		System.out.println("あなたの情報");
		System.out.println("名前：" + human.getName());
		System.out.println("年齢：" + human.getAge());
		System.out.println("誕生日：" + human.getBirsday());
		human.setInformation(human.getName(), human.getAge(), human.getBirsday());
		System.out.println(human.getInformation()[1]);
	}
}
