package rennsyuumonndai3;

public class Main {
	public static void main(String[]args){


	Pet [] array = new Pet[3];
	array[0] = new Neko();
	array[1] = new Inu();
	array[2] = new Tori();

//	for (Pet p : array) {
//	p.azukaru();
//}
	PetHotel ph = new PetHotel();
	ph.service(array);
}
}

