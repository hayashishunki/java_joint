package java_joint;

import java.util.Scanner;

public class bunnki {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inakun = scanner.next();
		
		if(inakun == null) {
			System.out.println("無効な値です");
		} else {
			System.out.println(inakun);
		}
		
		System.out.print(inakun);
		scanner.close();
	}

}
