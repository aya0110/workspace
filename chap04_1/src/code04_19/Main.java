package code04_19;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] scores = {{40,50,60,90},{80,60,70}};
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		//中身を順番で表示させてください
		for (int i = 0;i<scores.length; i++) {
			for(int j =0; j <scores[i].length; j++) {
			System.out.println(scores[i][j]);
		}
			//拡張for文
	for(int[] inner:scores) {
		for (int value : inner) {
			System.out.println(value);
		}
	}
		}
	}
}
