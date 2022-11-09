package java_joint;

import java.util.Scanner;

public class paiza1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();//何回繰り返すか
		//出力結果としてYES,NO条件＝０であればNO,以外はYES
		String jarge = "";
		int i = 1;
		
		while(i <= N) {
			int A = scanner.nextInt();//N番目の値
			if(A == 0) {
				jarge = "NO";
				break;
			} else {
				jarge = "YES";
			}
			i++;
		}
		System.out.println(jarge);
	}

}
