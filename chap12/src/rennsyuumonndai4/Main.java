package rennsyuumonndai4;

public class Main {
	public static void main(String[]args){
 Burger b1 = new Cheese();
 b1.setCalory(100);

 Burger b2 = new Teriyaki();
 b2.setCalory(200);

 Burger b3 = new Rice();
 b3.setCalory(300);

 int totalCalory = 0;

 Burger [] burger = {b1,b2,b3};
 for (Burger b : burger) {
	 totalCalory += b.getCalory();
 }
System.out.println(totalCalory);
}
}
