package code03_02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean doorClose = false;
		while (doorClose == true) {
			System.out.println("ノックする");
			System.out.println("1分待つ");
		}
		//以下、練習問題
		//変数1を使ってコンソールに1－１０までの数字を表示してください
		int num = 1;
		while (num <= 10) {
			System.out.println(num);
			num++;
		}
		//コンソールに「明日はお休み☆」と20回表示してください。
		int a = 1;
		while (a <= 20) {
			System.out.println("明日はお休み☆");
			a++;
		}

		//以下のように、コンソールに出力を行ってください。
		int tsuki = 1;
		int kane = 50000;
		while (tsuki <= 4) {
			System.out.println(tsuki + "月の給料日：所持金\\" + kane);
			tsuki++;
			;
			kane += 50000;
		}

		int gatsu = 4;
		int en = 200000;
		while (gatsu <= 8) {
			System.out.println(gatsu + "月の給料日：所持金\\" + en);
			gatsu++;
			en += 50000;
		}

		//以下のように、コンソールに出力を行ってください。
		int g = 4;
		int h = 200000;
		while (g <= 8) {
			if (g == 6) {
				h = 0;
				System.out.println(g + "月の給料日：所持金\\" + h + "やってもうた；");
				h += 50000;
			}
			System.out.println(g + "月の給料日：所持金\\" + h);
			h += 50000;
			}
			g ++;
		}

		// 1
		
		

		//2
		int kazu = 1;{
		while (kazu <= 10) {
			System.out.println(kazu);
			kazu++;
		}

		//3
		int f = 1;
		while (f <= 10) {
			System.out.println(f + "月");
			f++;
		}

		//4
		int bai = 2;
		while (bai <= 10) {
			System.out.println(bai);
			bai += 2;
		}

		//5
		int c = 200;
		while (c <= 1000) {
			System.out.println(c);
			c += 200;
		}

		//6
		int d = 200;
		while (d <= 1000) {
			System.out.println(d + "円");
			d += 200;
		}
		//		int d = 1;
		//		while(d <= 5) {
		//		System.out.println(d*200 +"円");
		//		d ++;
		//		}

		//7
		int e = 1;
		while (e <= 9) {
			System.out.println(e + "月");
			e += 2;
		}
		System.out.println("パスワードを登録します");
		String passFst = new java.util.Scanner(System.in).nextLine();
		System.out.println("パスワードを確認をします");
		String passSec = new java.util.Scanner(System.in).nextLine();
		if(passFst.equals(passSec)) {
		System.out.println("登録しました");
		}else {
			System.out.println("パスワードが異なります");
		}
	}

}
