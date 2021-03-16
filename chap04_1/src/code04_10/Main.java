package code04_10;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] scores = {20,30,40,50,80};
		int sum = 0;
		for(int i = 0; i  < scores.length; i++) {
			sum += scores[i];
		}
		int avg = sum / scores.length;
		System.out.println("合計点" + sum);
		System.out.println("平均点" + avg);

	//最大値を調べる
//		int max = 0;
//		for(int i = 0;i<scores.length; i++) {
//		max = Math.max(max, scores[i]);
//		}
//		System.out.println("最大値"+ max);

		int max =0;//一番小さい数を定義する。
		for(int i=0;i<scores.length;i++) {
		max = Math.max(max, scores[i]);
		}
		System.out.println("最大値"+max);


	//最小値を調べる
		//int min = 100 のように大きい数を設定する
		int min = Integer.MAX_VALUE;//一番大きい数を定義する。
		for(int i = 0;i<scores.length; i++) {
		min = Math.min(min, scores[i]);
		}
		System.out.println("最小値"+ min);

	//すべての値を掛け算した値
		int mul= 1;
		//最初を０にすると全部かけても０になってしまうので１にする
		for(int i = 0;i<scores.length; i++) {
		mul *= scores[i];
		}
		System.out.println("掛け算すると"+ mul);
	}

}
