package rensyuumondai2;

public class SmallCar extends PassengerCar{

	public SmallCar(int price) {
		super(price);
	}

	public void drive() {
		System.out.println(this.name + "は、燃費良く走る");
	}
	public void stop() {
		System.out.println(this.name + "は、燃費良く停まる");
	}

}
