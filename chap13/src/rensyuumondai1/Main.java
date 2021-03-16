package rensyuumondai1;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero ();
		h.setHp(100);
		h.setName("アサカ");

		Wand w = new Wand ();
		w.setPower(5.0);

		Wizard z = new Wizard (-6,-7);
		z.setHp(200);
		//Wizardのメソッドを呼び出していく
		z.heal(h,w);
	}
}
