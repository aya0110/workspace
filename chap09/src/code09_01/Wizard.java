package code09_01;

public class Wizard {
	String name;
	int hp;
	public static void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した！");
		System.out.println(h.hp);	
	}
}
