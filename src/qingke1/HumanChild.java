package qingke1;

public class HumanChild extends Human {
	private String like;

	public String getLike() {
		return like;
	}

	public void setLike(String like) {
		this.like = like;
	}

	public HumanChild(String name, double height, double weight) {
		super(name, height, weight);
		// TODO Auto-generated constructor stub
	}

	public void sing(String song) {
		super.sing(song);
		System.out.println("==============");
		System.out.println(name + "³ªÁË" + song);
		System.out.println("==============");
	}

}
