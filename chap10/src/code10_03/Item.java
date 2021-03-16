package code10_03;

public class Item {
	String name;
	int price;
	//以下コンストラクタ
	public Item(String name) {
		this.name = name;
		this.price = 0;
	}
	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

}
