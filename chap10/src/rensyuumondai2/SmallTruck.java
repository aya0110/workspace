package rensyuumondai2;

public class SmallTruck extends Truck{

	public SmallTruck(int price) {
		super(price);
	}

	public void load() {
		System.out.println(this.name + "は、荷物をやや積む");
	}

}
