package rensyuumondai1;

public class Wand {
	private String name; //杖の名前
	private double power; //杖の魔力

	//以下setter
//	public void setPower(double power) {
//		this.power = power;
//	}
	//問4②
	public void setPower(double power) {
	 if(power >= 0.5 && power <= 100.0) {
		throw new IllegalArgumentException
		("杖による増幅率は0.5以上100以下である。処理を中断。");
			}
	 	this.power = power;
		}

	//問4①
	public void setName(String name) {
	if(name.length() >= 3) {
		throw new IllegalArgumentException
		("名前が３文字以上である。処理を中断。");
			}
		this.name = name;
		}

	//以下getter
	public double getPower() {
		return this.power;
	}
}
