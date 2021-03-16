package rensyuumondai4;

public class Burger {
	//ハンバーガーの情報を管理するバーガークラスを作成します。
	//バーガークラスには以下の情報を持たせます。
	//「バーガー名、カロリー、原価」※すべてprivate修飾
	//チーズバーガーを生成してください。※カロリーと原価は任意
	//レタスバーガーを生成してください。※カロリーと原価は任意
	//チーズバーガーとレタスバーガーのカロリー合計を計算してください。

	//フィールドを設定する。
	private String name;
	private int cal;
	private int genka;

	//フィールドに値を代入する。
	public void setName(String name) {
		this.name = name;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	public void setGenka(int genka) {
		this.genka = genka;
	}
	//チーズバーガーとレタスバーガーのカロリーを情報を獲得する。
	public int getCal() {
		return this.cal;
	}
	public int getGanks() {
		return this.genka;
	}
}
