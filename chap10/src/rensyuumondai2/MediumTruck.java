package rensyuumondai2;

public class MediumTruck extends Truck{

	public MediumTruck(int price) {
		super(price);
	}

	public void load() {
		System.out.println(this.name + "は、荷物をぼちぼち積む");
	}
}
