package code02_03;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	System.out.println("私の好きな記号は二重引用符(\")です");
	
	double teihen = 3;
	double takasa = 2;
	double menseki = (teihen * takasa)/2;	
	//割って小数点になるのでdoubleを使うのが望ましい
	System.out.println("三角形の面積は"+ menseki);
	
	int wine = 3500;
	int money= 20000;
	int hon = money / wine ;
	int otsuri = money - wine * hon ;
	//int otsuri = money % wine;
	System.out.println(hon + "本買えて、お釣りは\\"+ otsuri + "だった");				
	}
		}
