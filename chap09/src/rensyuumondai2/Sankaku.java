package rensyuumondai2;

public class Sankaku {
	//※セッターゲッターは不要
	//練習問題①
	//三角形の面積を計算する三角クラスを定義します。
	//三角クラスはフィールドに「底辺」と「高さ」の値を持ちます。
	//次にメイン側で三角クラスのインスタンスを生成し、
	//それと同時に「底辺」と「高さ」を指定します。
	//メインメソッドから、面積を表示させてください。
	
	public double teihen ;
	public double takasa;
	//フィールドに「底辺」と「高さ」の値を定義。
	//コンストラクタを作成する。
	public Sankaku(double takasa,double teihen) {
	
	//「底辺」と「高さ」を指定します。
	this.takasa = takasa;
	this.teihen = teihen;
}
}


