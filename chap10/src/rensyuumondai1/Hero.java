package rensyuumondai1;

public class Hero {
	String name = "ミナト";
	int hp = 100;
	//コンストラクタを作成
	public Hero() {
		System.out.println("Heroクラスのコンストラクタが動作");
	}

	//戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 10;
		System.out.println("10ポイントのダメージをあたえた！");
		}
	//逃げる
	public void run () {
		System.out.println(this.name  + "は逃げ出した！");
	}
}
