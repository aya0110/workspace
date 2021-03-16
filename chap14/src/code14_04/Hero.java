package code14_04;

public class Hero {
	String name;
	int hp;
	@Override
	public String toString() {
		return "名前："  + this.name + "/ HP:" + this.hp ;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object o) {
	if(this == o) {
		return true;
	}
	if(o instanceof Hero) {
		Hero h = (Hero)o;
		if(this.name.equals(h.name)) {
			return true;
			}
		}
	return false;
		}
	}




}
