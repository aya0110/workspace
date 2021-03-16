package code14_09;

public class Hero {
	String name;
	int hp;
	static int money;

	public static void setRandomMoney() {
		Hero.money = (int)(Math.random()*1000);
		//Math.random 0以上1未満のこと
	}
}
