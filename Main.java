package java_joint;

public class Main {

	public static void main(String[] args) {
		Sindan sindan = new Sindan();
		
		//車体の名前を配列に格納
		String[] CarName = { "inakun", "inakun2", "inakun3", "inakun4" };
		//Carクラスのインスタンスを格納するための配列を用意
		Car[] carArray = new Car[CarName.length];
		
		//Carクラスのインスタンスを4つ作成しcarArrayへ格納
		for (int i = 0; i < CarName.length; i++) {
			Car car = new Car(CarName[i], i);
			carArray[i] = car;
			//インスタンス配列から値取り出す時[i]が必要
		
		}
		System.out.println(carArray[1].getName());
		System.out.println(carArray[1].getBodyNo());
		
//				sindan.Divination();
		}
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
 * 
 * carクラス作成
 * 起動初期処理で名前を決め、それを持たせる
 * 配列用意する(くるまの名前あり)４回ループ処理させて車体番号は回数分の結果でよし
 * インスタンス化する
 * 
 * */