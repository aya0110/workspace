package rennsyuumonndai2;

public class Main {
	public static void main(String[]args){
	Animal [] array = new Animal[3];
	array[0] = new Inu();
	array[1] = new Neko();
	array[2] = new Tori();
	System.out.println("■実行結果■");
	for (Animal a : array) {
	a.say();
	}
}
}

//

