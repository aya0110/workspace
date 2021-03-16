package rensyuumondai1;

public class PoisonMatango extends Matango{

	//毒を用いた攻撃が可能な残り回数
	int rest = 5;

	//PoisonMatangoのコンストラクタ
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	//attackメソッド
	public void attack(Hero h) {
		super.attack(h);
		//毒攻撃の残り回数が0でなければ以下を追加で行う
		if(this.rest != 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int doku = h.hp/5;
			h.hp -= doku;
			System.out.println(doku +"のダメージ");
			this.rest--;

			}
	}

}
