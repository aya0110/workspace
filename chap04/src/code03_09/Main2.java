package code03_09;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i =0; i<10; i++) {
			if( i == 3) {
				break;
		}
		System.out.println(i);
		}
		for(int i = 0; i<10; i++) {
			if(i == 3) {;
				continue;
		}
		System.out.println(i);
		}
	}
}
