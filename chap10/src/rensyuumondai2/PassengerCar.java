package rensyuumondai2;

public abstract class PassengerCar extends Car{

	public PassengerCar(int price) {
		super(price);
	}

	public void drive() {
		System.out.println(this.name + "は、普通に走る");
	}
	public void stop() {
		System.out.println(this.name + "は、普通に停まる");
	}

}

