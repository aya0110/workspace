package code15_01;

public class Main {

	public static void main(String[] args) {
//		String s1 = "スッキリJava";
//		String s2 = "Java";
//		String s3 = "java";
//		String s4 = "     " ;//半角スペース5つ
//		String s5 = "　　　　　" ;//全角スペース5つ
//
//		if (s2.equals(s3)) {
//			System.out.println("s2とs3は等しい");
//		}
//		if(s2.equalsIgnoreCase(s3)) {
//			System.out.println("s2とs3はケースを区別しなければ等しい");
//
//		}
//		System.out.println("s1の長さは" + s1.length() + "です");
//
//		if(s1.isEmpty()) {
//			System.out.println("s1は空文字です");
//		}


//		String s1 = "Java and JavaScript";
//		if(s1.contains("Java")) {
//			System.out.println("文字列s1は、Javaを含んでいます");
//		}
//		if(s1.endsWith("Java")) {
//			System.out.println("文字列s1は、Javaが末尾にあります");
//		}
//		System.out.println("文字列s1で最初にJavaが登場する位置は" +
//		s1.indexOf("Java"));
//
//		System.out.println("文字列s1で最後にJavaが登場する位置は" +
//				s1.lastIndexOf("Java"));
//
//		if(s1.startsWith("Java")) {
//			System.out.println("文字列s1は、Javaが最初にあります");
//
//		System.out.println("文字列s1で最初にJavaが登場する位置は" +
//					s1.indexOf("Java"));
//		}

//		String s1 = "Java Programming";
//		System.out.println("文字列s1の4文字目以降は" +
//		s1.substring(3));//a programming
//
//		System.out.println("文字列s1の4～8文字目は" +
//				s1.substring(3,8));//a pro
//		System.out.println(s1.charAt(3));

		String s1 = "  Java Programming";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim());
		System.out.println(s1.replace("ing","mm"));
	}

}
