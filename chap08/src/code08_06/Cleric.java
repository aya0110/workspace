package code08_06;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	// int hp = MAX_HP;
	// int mp = MAX_MP;と書くこともできる
	
	public void selfAid() {
		//MPを5消費する
		this.mp -= 5;
		//HPを最大HPまで回復する
		this.hp = this.MAX_HP;
		System.out.println(this.name + "はセルフエイドを唱えた！");
		System.out.println("体力が" + this.hp + "まで回復した！");
	}
	public int pray(int sec) {
		//ランダムの秒数を決定
		int hosei = new java.util.Random().nextInt(3);
		//回復量を決定
		int kaihuku = sec + hosei;
		//元のMPと回復量が最大値MPより大きい場合
		if(this.mp + kaihuku >= this.MAX_MP) {
			int sa = this.MAX_MP - this.mp;
	    //戻り値に実際に回復したMPの量
			return sa;	
		}
		else {
		    //戻り値に実際に回復したMPの量
			return kaihuku;	
		}
	}
	
}
