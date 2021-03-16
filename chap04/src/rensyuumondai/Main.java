package rensyuumondai;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//3-1
		//1
		int weight = 65;
		if(weight == 60) {

		}
		//2
		int age1 =10;
		int age2 =20;
		if((age1 + age2) *2 > 60) {

		}
		//3
		int age = 3;
		if(age %2 == 1) {
			System.out.println(age + "は奇数");
		}else {
			System.out.println(age + "は偶数");
		}
		//4
		String name ="湊";
		if(name.equals("湊")) {
			System.out.println(name + "は同じ");
		}else {
			System.out.println(name + "は同じではない");
		}
		//3-3
		int isHungry = 0;
		String food = "apple";
		System.out.println("こんにちは");
		if( isHungry == 0) {
		System.out.println("お腹がいっぱいです");
		}else {
		System.out.println("はらぺこです");
		}
		if ( isHungry == 1) {
		System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");
		//三項条件演算子
		System.out.println(isHungry == 0? "お腹がいっぱいです":"ごちそうさまでした");

		//3-4
		/*
		 elseブロックの{}がないため、寝ますの表示はifの外とみなされ
		 必ず実行される。elseの時だけ実行したいのであれば{}で囲む
		 */



		//3－5
		System.out.print("[メニュー]1:検索 2:登録 3:削除 4:変更>");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch (selected) {
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
			break;
		}
		//3-6
		System.out.println("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(10) ;
		for(int i = 0; i<5; i++) {
			System.out.println("0～9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == ans) {
				System.out.println("アタリ！");
				break;
			}else{
				System.out.println("違います");
			}
		}
			System.out.println("ゲームを終了します");

	}

}
