package rensyuumondai;

public class Thief {
	String name;
	int hp;
	int mp;
//名前・HP・MPを指定してインスタンス化
	public Thief(String name,int hp,int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
//名前・HPを指定してインスタンス化
	public Thief(String name,int hp) {
		this(name,hp,5);
	}
//名前を指定してインスタンス化
		public Thief(String name) {
			this(name,40);
}
 }