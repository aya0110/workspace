package rensyuumondai1;
public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	//以下setter
//	public void setHp(int hp) {
//		this.hp = hp;
//	}
	//問4①
	public void setName(String name) {
		if(name.length() >= 3) {
			throw new IllegalArgumentException
			("名前が３文字以上である。処理を中断。");
		}
		this.name = name;
	}
	//問4③
	public void setWand(Wand wand) {
		if(wand == null) {
		throw new IllegalArgumentException
		("魔法使いは必ず杖を装備する。処理を中断。");
			}
		this.wand = wand;
		}
	//問4④
	public void setHp(int hp) {
		if(hp < 0) {
			throw new IllegalArgumentException
			("HPが0未満である。処理を中断。");
		}
		this.hp = hp;
	}
	//問4④0以下を入れようとすると0になるコンストラクタを作成
	public Wizard(int hp , int mp) {
		if(hp < 0 || mp < 0) {
		this.hp = 0;
		this.mp = 0;
		}
	}

	//以下getter
	public int getHp() {
		return this.hp;
	}

	public void heal (Hero h, Wand w) {
		int basePoint = 10; //基本回復ポイント
		int recovPoint =   //杖による増幅
				(int)(basePoint * w.getPower());
		h.setHp(h.getHp() + recovPoint); //勇者のHPを回復する
		System.out.println
		(h.getName () + "のHPを" + recovPoint + "回復した！");

	}
}
