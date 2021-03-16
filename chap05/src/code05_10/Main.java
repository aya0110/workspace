package code05_10;

public class Main {
	//1つ目のaddメソッド
	public static int add(int x , int y) {
		return x + y;
	}
	//2つ目のaddメソッド
	public static double add(double x , double y) {
		return x + y;
	}
	//3つ目のaddメソッド
		public static String add(String x , String y) {
			return x + y;
		}
	//4つ目のaddメソッド
		public static int add(int x , int y, int z) {
			return x + y + z;
		}
	public static void main(String[] args) {
		System.out.println(add(10,20));
		System.out.println(add(3.5,2.7));
		System.out.println(add("Hello","World"));
		System.out.println(add(10,20,30));
	}
//	//変数がちがうだけではエラーになる
//	public static int add(int a,int b) {
//		return a + b;
//	}
//	//戻り値が違うだけではエラーになる
//	public static String add(int x,int y) {
//		return x + y;
//	}
//	//アクセス修飾子が違うだけではエラーになる
//	static String add(int x,int y) {
//		return x + y;
//	}
}
