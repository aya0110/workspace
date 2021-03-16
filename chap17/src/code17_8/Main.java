package code17_8;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");
		}catch(Exception e) {
			System.out.println("何らかの例外が発生しました");
		}finally {
			if(fw !=null) { //fwがnullではないときだけclose()を試みる
			}
			try {
				fw.close();
			}catch(IOException e) {
				;//空分　何も処理しない
			}

		}

	}

}
