package java_joint;

public class Main {

	public static void main(String[] args) {
		Sindan sindan = new Sindan();
		
		sindan.Divination();
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
 * 処理を分割する占い専用化
 * 占いの結果を格納する変数を一人ずつ持たせる
 * 
 * */