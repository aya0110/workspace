package rensyuumondai2;

public class Camper extends PassengerCar{

	public Camper(int price) {
		super(price);
	}

	public void camp() {
		System.out.println(this.name + "は、ここをキャンプ地とする");
	}
}
