package rensyuumondai3;

public class Main {

	public static void main(String[] args) {
		// 三角クラスのインスタンスを生成する。
		Sankaku k = new Sankaku(5.0,6.0);
		//メインメソッドから、面積を表示させてください。
		System.out.println("底辺" + k.teihen + "高さ" +
				k.takasa + "の面積は" + k.keisan() + "です。");
	}

}
