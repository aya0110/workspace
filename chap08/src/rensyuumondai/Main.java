package rensyuumondai;

public class Main {

	public static void main(String[] args) {
		//車を生成する。
		Car c = new Car();
		//フィールドに初期値をセット
		c.fuel = 100;
		c.speed = 60;
		//車のメソッドを呼び出してゆく
		c.accelarate(50);
		int kyorisu = c.run(5);
		//※↑戻り値で返ってきた値を変数で代入する！！！
		System.out.println("現在" + c.fuel +"消費して、結果として"
		+ kyorisu +"km走った。");
		//System.out.println(c.run(5);  +"km走った。");
		c.showMeter();
		c.stop();
		c.showMeter();
	}

}
