package code02_rennsyuumondai;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//練習１
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		fortune++;
		System.out.println("占いの結果が出ました！");
		System.out.println( ageString +"歳の" + name + "さん、あなたの運気番号は"+ fortune + "です");
		System.out.println("1:大吉 2:中吉 3:吉 4:凶");

		int maru = new java.util.Random().nextInt(6);
		maru++;
		int sankaku = new java.util.Random().nextInt(6);
		sankaku++;
		int kati = Math.max(maru, sankaku);
		System.out.println(maru + "と" + sankaku + "は、" + kati +"の方が大きいので、" + kati + "の勝ち");
	}
}