package qingke1;

public class Human {
	public String name;
	private double height;
	private double weight;

	public Human(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public static void description() {
		System.out.println("人类能独立行走，劳动");
	}

	public void sing(String song) {

		System.out.println(name + "唱了123" + song);
	}

	public void myInformation() {
		System.out.println("name:" + name + ",height:" + height + ",weght:" + weight);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human.description();
		Human human = new Human("小宝", 175, 120);
		human.myInformation();
		human.sing("演员");
	}

}
