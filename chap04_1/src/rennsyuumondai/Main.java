package rennsyuumondai;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//4-1
		int[] points = new int [5];
		double[] weights = new double [5];
		boolean[] answers = new boolean [3];
		String[] names = new String [3];
//4-2
		int [] moneylist = {121902,8302,55100};
		for (int i=0; i<moneylist.length; i++) {
				System.out.println(moneylist[i]);
		}
			for (int money : moneylist)	{
			System.out.println(moneylist[money]);
			}
//4-3
//		int[] counts = null;
//		float[] heights = {171.3F,175.0F};
//		System.out.println(counts[1]); //NullPointerException
//		System.out.println(heights[2]);//ArrayIndexOutofBoundsException
//
//
////4-4
//		int[] numbers = {3,4,9};
//		System.out.println("１桁の数字を入力してください");
//		int input = new java.util.Scanner(System.in).nextInt();
//		for(int value : numbers){
//			if (value  == input) {
//				System.out.println("アタリ！");

//4-4を改良しましょう
//		numbersの初期値は0^9のランダムで3つ設定しましょう
//		ただし、同じ数字が入ってはいけません。
		int [] seq = new int [3];
		for (int i = 0; i< seq.length;i++) {
			seq[0]= new java.util.Random().nextInt(10);
			System.out.println(seq[0]);
		}
		while ( seq[0] == seq[1]) {
	        seq[1]= new java.util.Random().nextInt(10);
	        System.out.println(seq[1]);
		}
		while ( seq[1] == seq[2] && seq[0] == seq[2]) {
	        seq[2]= new java.util.Random().nextInt(10);
	         System.out.println(seq[2]);
		}
//このあと拡張for文

//numbersの初期値は0-9のランダムで5つ設定しましょう
//		ただし、同じ数字が入ってはいけません。
//      その上で、２回入力を受け付け、
//		両方あっているときには「全部アタリ！」
//		片方合っているときには「アタリ！」と表示しましょう。
//		int [] num = new int [5];
//		for (int i = 0; i< num.length;i++) {
//			num[0]= new java.util.Random().nextInt(10);
//			System.out.println(num[0]);
//		}
//		while ( num[0] == num[1]) {
//	        num[1]= new java.util.Random().nextInt(10);
//		}
//		while ( num[1] == num[2] && num[0] == num[2]) {
//	        num[2]= new java.util.Random().nextInt(10);
//	         System.out.println(num[2]);
//		}
//		while ( num[2] == num[3]&& num[0] == num[3]&& num[1] == num[3]) {
//	        num[3]= new java.util.Random().nextInt(10);
//	        System.out.println(num[3]);
//		}
//		while ( num[3] == num[4]&& num[0] == num[4]&& num[1] == num[4]&& num[2] == num[4]) {
//	        num[4]= new java.util.Random().nextInt(10);
//	         System.out.println(num[4]);

		int[]numbers = new int [5];
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=new java.util.Random()NextInt(10);
			for(int i=0;i<numbers.length;i++) {
				numbers[i]=new java.util.Random()NextInt(10);



		}
		int kekka = (num[0]+ num[1] + num[2] + num[3] + num[4]);
		System.out.println("5桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		System.out.println("5桁の数字を入力してください");
		int input2 = new java.util.Scanner(System.in).nextInt();

	}
}


