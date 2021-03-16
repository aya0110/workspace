package rensyuumondai1;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");

		Hero h2 = new Hero("鈴木");
//
//		List<Hero>hero = new ArrayList<Hero>();
//		hero.add(h1);
//		hero.add(h2);
//		for (Hero i : hero) {
//			System.out.println(i.getName());

		Map<Hero,Integer>heros =
				new HashMap<Hero,Integer>();
		heros.put(h1, 3);
		heros.put(h2, 7);
		for (Hero key : heros.keySet()) {
			int value = heros.get(key);
			System.out.println(key.getName() + "が倒した敵は" + value +"人");

		}
	}

}
