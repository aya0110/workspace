package code05_12;

public class Main {
	//int型配列を受け取り、すべての要素を表示するメソッド
	public static void printAway(int[] array) {
		for (int element : array) {
			System.out.println(element);
		}
		array[0]=10;
	}
	public static void main(String[]args) {
		int [] array = {1,2,3};
		printAway (array); //配列を渡す
		System.out.println(array[0]);
	}
}
