package rensyuumondai2;

public class Main {

	public String filename(String folder,String file) {
		//\で終わるかを調べる
		if(!folder.endsWith("\\")) {
			folder = folder + "\\";
		}
		return folder + file;
	}

}
