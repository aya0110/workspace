package rensyuumondai;

public class Main1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//2月4日の練習問題①
//		長方形の面積を計算する「chouhoukeiArea()」を定義。
//		同メソッド内で任意の縦・横の値を決め、面積を出力しなさい。
//2月4日の練習問題②
//      長方形の面積を計算する「chouhoukeiArea()」を定義。
//		同メソッドから、面積を出力しなさい。
//		ただし縦・横の値は、メインメソッドから渡すこと。
//2月4日の練習問題③
//      三角形の面積を計算する「sankakuArea()」を定義。
//		また、面積を出力する「printArea()」を定義。
//		メインメソッドから底辺・高さを渡し、最後はprintArea()から出力する。
	public static void main(String[] args) {
		chouhoukeiArea( 2, 3);
	}
	public static void chouhoukeiArea( double tate , double yoko) {
		double ans = tate * yoko  ;
		System.out.println("面積は" + ans);
	}
	}

}
