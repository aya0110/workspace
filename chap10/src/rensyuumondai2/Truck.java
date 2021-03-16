package rensyuumondai2;

public abstract class  Truck extends Car{

	public Truck(int price) {
		super(price);
	}

	public void drive() {
		System.out.println(this.name + "は、ゴトゴト走る");
	}
	public void stop() {
		System.out.println(this.name + "は、ゴトゴト停まる");
	}

}
