package code10_01;

import rensyuumondai1.Hero;

public class SuperHero extends Hero{
	boolean flying;

	//コンストラクタを作成
	public SuperHero() {
		super(); //省略しても動く
		System.out.println("SuperHeroクラスのコンストラクタが動作");
	}
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	public void run() {
		System.out.println(this.name + "は撤退した");
	}
	public void attack(Matango m) {
		super.attack(m);
		if(this.flying) {
			super.attack(m);
		}
	}
}
