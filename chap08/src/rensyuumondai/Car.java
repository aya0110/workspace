package rensyuumondai;

public class Car {//1.車(車)クラスを作成しましょう。
	//2,車クラスは燃料（fuel)を表す整数型の値と、
	//時速（speed)を表す整数型の値を持つ。
	int fuel;//燃料
	int speed;//時速

	//3,車クラスは加速する(accelarate)という操作を持つ。
	//この操作は引数として時速何キロ分加速するかを整数で指定し、
	//現在の時速に指定された分の数値を加算する。
	public void accelarate(int kasoku) {
		this.speed  += kasoku;
		System.out.println("現在の時速は"+ this.speed +"kmです。");
	}
	//4,車クラスは走る(run)という操作を持つ。
	//この操作は引数として時間(hour)を指定し、
	//走った距離数分燃料を消費し、
	//結果として何キロ走ったかを返り値として持つ。
	public int run(int hour) {
		int kyorisu;//走った距離数を定義
		kyorisu = this.speed*hour;
		this.fuel -= kyorisu;
		return kyorisu;
	}
	//5,車クラスは停止する(stop)という操作を持つ。
	//この操作を行うと時速は０になり、
	//停止したことを知らせる表示を行う。
	public void stop() {
		this.speed = 0;
		System.out.println("車が停止して時速0kmになりました。");
	}
	//6,車クラスは時速を確認する(showMeter)という操作を持つ。
	//この操作をすると現在の燃料と時速を表示する。
	public void showMeter() {
		System.out.println("現在の燃料は"+ this.fuel +"です。");
		System.out.println("現在の時速は"+ this.speed +"kmです。");
	}

}
