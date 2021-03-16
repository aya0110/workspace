package code09_08;

public class Hero {
	String name;
	int hp;

	public void attack() {

	}
	public Hero(String name) {
		this.hp = 100; //hpフィールドを100で初期化
		this.name = name; //引数の値でフィールドを初期化
	}
	public Hero() {
		this( "ダミー");
	}
}
