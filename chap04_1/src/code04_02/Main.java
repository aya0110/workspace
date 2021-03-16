package code04_02;

public class Main {

	public static void main(String[] args) {
		
	int[] scores;
	scores = new int[5];
	//一行で書く場合
	int[]scores2 = new int[5];
	//要素の数を知る
	int num = scores.length;
	System.out.println("要素の数" + num);
	//配列への代入と取得
	scores[1]=10;
	System.out.println(scores[1]);
	//int[]型の場合0で初期化されている
	System.out.println(scores[0]);
	}

}
