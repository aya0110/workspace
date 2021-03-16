package rensyuumondai1;

public class Main {

	public static void main(String[] args) {
	//Account a を生成する。
	Account a = new Account();
	a.accountNumber = "4649";
	a.balance = 1592;
	System.out.println(a);

	//Account b を生成する。
	Account b = new Account();
	b.accountNumber = "   4649";
	if(a.equals(b)) {// aのインスタンスとbインスタンスを比べる
		System.out.println("同じ口座です");
	}else {
		System.out.println("違う口座です");
	}

	}

}
