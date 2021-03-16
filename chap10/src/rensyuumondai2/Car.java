package rensyuumondai2;

public abstract class Car {
	String name; //名前
	int price; //価格
	int fuel; //燃費

	//コンストラクタ
	public Car(int price) {
		if(this.price < 100000) {
			throw new IllegalArgumentException
			("値段が10万円未満である。処理を中断");
		}
	}

	public abstract void drive() ; //走る

	public abstract void stop(); //停まる　
}
