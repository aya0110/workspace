package rensyuumondai;

public class Main2 {

	//2月4日の練習問題③
//  三角形の面積を計算する「sankakuArea()」を定義。
//	また、面積を出力する「printArea()」を定義。
//	メインメソッドから底辺・高さを渡し、最後はprintArea()から出力する。
public static void main(String[] args) {
	sankakuArea( 2, 3);
}
public static void sankakuArea( double tate , double yoko) {
	double ans = tate * yoko / 2 ;
    printArea(ans) ;
}
public static void printArea(double ans) {
	System.out.println("面積は" +ans);
}
}
