package rensyuumondai2;

public class BigTruck extends Truck{

	public BigTruck(int price) {
		super(price);
	}

	public void load() {
		System.out.println(this.name + "は、荷物をめっちゃ積む");
	}

}
