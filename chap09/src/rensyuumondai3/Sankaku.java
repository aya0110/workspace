package rensyuumondai3;

public class Sankaku {
	//※セッターゲッターは不要
	//練習問題②
	//三角形の面積を計算する三角クラスを定義します。
	//三角クラスはフィールドに「底辺」と「高さ」の値を持ちます。
	//メソッドに面積を計算するメソッドを持ちます。
	//三角クラスのインスタンスを生成すると同時に、
	//「底辺」と「高さ」を指定します。
	//メインメソッドから、面積を表示させてください。

	//フィールドに「底辺」と「高さ」の値を定義。
	double takasa;
	double teihen;

	//コンストラクタを作成
	public Sankaku(double takasa, double teihen) {
		this.takasa = takasa;
		this.teihen = teihen;
	}

	//メソッドに面積を計算するメソッドを定義。
	public double keisan() {
		double k = this.teihen * this.takasa / 2;
		return k;
	}

}
