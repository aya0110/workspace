package code15_17;

public class main {

	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String [] words =s.split("[,:]");
		for(String w : words) {
			System.out.print(w + "->");
		}

	}

}
