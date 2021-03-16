package rensyuumondai1;

public class Main {
	public static void main(String[]args) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<100;i++) {
			//appendメソッドで文字列を追加していく
			sb.append(i+1).append(",");
		}
		String s = sb.toString();
		String []a = s.split(",");
	}
}
