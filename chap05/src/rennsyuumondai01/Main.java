package rennsyuumondai01;

//練習5-1
//public class Main {
//public static void main (String[]args) {
//		introduceOneself();
//	}
//	public static void introduceOneself() {
//		String name = "ari";
//		int age = 5;
//		double tall = 120;
//		char zodiac = '辰';
//		System.out.println("私の名前は" + name + "です");
//		System.out.println("私の年齢は" + age + "歳です");
//		System.out.println("私の身長は" + tall + "cmです");
//		System.out.println("私の干支は" + zodiac + "です");
//	}	
//}
//練習5-2
//public class Main {
//	public static void main(String[]args) {
//		String title = "初めまして";
//		String address = "ppp.ppp@gmail.com";
//		String text = "初めまして。こんにちは。よろしくお願いします。";
//		email(title,address,text);
//		email(address,text);
//		}
//	public static void email(String title,String address ,String text) {
//		System.out.println(address +"に以下のメールを送信しました");
//		System.out.println("件名：" + title);
//		System.out.println("本文：" + text);
//	}
//練習5-3
//
//	public static void email(String address ,String text) {
//		System.out.println(address +"に以下のメールを送信しました");
//		System.out.println("件名：無題");
//		System.out.println("本文：" + text);
// }
//}

//練習5-4
public class Main {
	public static void main(String[]args) {
	 double bottom = 10.0;
	 double height = 5.0;
	 double sankaku = calcTriangleArea(bottom,height);
      System.out.println("三角形の面積は" + sankaku + "cm2です。");
	 double radius = 5.0;
	 double en = calcCircleArea(radius);
	 System.out.println(String.format("円の半径が5.0cmの場合、面積は%.1fcm2",
			 en));
	 System.out.println("円の面積は" + en + "cm2です。");
}
public static double calcTriangleArea(double bottom,double height){
	double sankaku = bottom * height /2 ;
	return sankaku;
}
public static double calcCircleArea(double radius) {
	double en = radius * radius * 3.14;
	return en;
}
}

	



