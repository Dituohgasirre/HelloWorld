package qingke1;

public class Dog implements Cloneable{
	private String name;
	private String price;
	Person master;
	public Dog(String name,String price){
		this.name=name;
		this.price=price;
		this.master=new Person("wei","hangzhou");
	}
	 public  Object clone() throws CloneNotSupportedException {
		 Dog dog =(Dog) super.clone();//克隆狗
		 this.master=(Person) master.clone();//克隆狗中的Person（深克隆），Person类中要覆写clone方法。
		 return dog;
	 }

	 
	


	@Override
	public String toString() {
		return "Dog [name=" + name + ", price=" + price + ", master=" + master + "]";
	}





	public static void main(String[] args) throws CloneNotSupportedException {
		//Person p =new Person("wei", "hangzhou");
		Dog d1 =new Dog("大黄","we");
		Dog d2 =(Dog) d1.clone();
		d1.name="小黑";
		d2.master.setName("wang");
		d1.master.setAddress("xihu");
		
		System.out.println(d1);
		System.out.println(d2);
	}

}
