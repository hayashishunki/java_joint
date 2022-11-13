package java_joint.first_test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Karender {

	public void test() {
        Date exDate = new Date();   // 2．日付（今回は現在の日時）を取得
        SimpleDateFormat exDateFormat = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss"); // 3．パターンを指定

        String birsday = exDateFormat.format(exDate); // 4．日付をフォーマットし出力
        
        System.out.println("現在の時刻は" + birsday);
	}
}
