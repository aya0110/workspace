package rensyuumondai2;

public class Main {

	public static void main(String[] args) {
		//メイン側で三角クラスのインスタンスを生成
		//それと同時に「底辺」と「高さ」を指定します。
		//メインメソッドから、面積を表示させてください。
		Sankaku s = new Sankaku(3.0,10.0);
		double menseki = s.teihen * s.takasa/2;
		System.out.println("底辺" + s.teihen + "高さ" +
		s.takasa + "の面積は" + menseki + "です。");
		
	}

}
