package java_joint;

import java.util.Scanner;

class test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("あなたのお名前は？: ");
		String name = scanner.next();
		System.out.println("こんにちは" + name + "さん");
	}
}
