package rensyuumondai2;

public class Main {

	public static void main(String[] args) {


		GeneralCar gc = new GeneralCar(200000);
		gc.name = "一般乗用車";

		SmallCar sc = new SmallCar(200000);
		sc.name = "小型乗用車";

		Camper cm = new Camper(50000);
		cm.name = "キャンピングカー";

		BigTruck bt = new BigTruck(3000000);
		bt.name = "大型トラック";

		MediumTruck mt = new MediumTruck(400000);
		mt.name = "中型トラック";

		SmallTruck st = new SmallTruck(500000);
		st.name = "小型トラック";

	}

}
