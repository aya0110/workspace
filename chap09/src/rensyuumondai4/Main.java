package rensyuumondai4;

public class Main {

	public static void main(String[] args) {
		//チーズバーガーを生成してください。※カロリーと原価は任意
		Burger b1 = new Burger ();
		b1.setName("cheese");
		b1.setCal (500);
		b1.setGenka (100);
		//レタスバーガーを生成してください。※カロリーと原価は任意
		Burger b2 = new Burger ();
		b2.setName ("lettuce");
		b2.setCal (400);
		b2.setGenka (200);
		//チーズバーガーとレタスバーガーのカロリー合計を計算してください。
		int goukei = b1.getCal() + b2.getCal();
		System.out.println("チーズバーガーとレタスバーガーのカロリー合計は"
				+ goukei + "です。");

	}

}
