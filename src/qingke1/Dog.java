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
		 Dog dog =(Dog) super.clone();//��¡��
		 this.master=(Person) master.clone();//��¡���е�Person�����¡����Person����Ҫ��дclone������
		 return dog;
	 }

	 
	


	@Override
	public String toString() {
		return "Dog [name=" + name + ", price=" + price + ", master=" + master + "]";
	}





	public static void main(String[] args) throws CloneNotSupportedException {
		//Person p =new Person("wei", "hangzhou");
		Dog d1 =new Dog("���","we");
		Dog d2 =(Dog) d1.clone();
		d1.name="С��";
		d2.master.setName("wang");
		d1.master.setAddress("xihu");
		
		System.out.println(d1);
		System.out.println(d2);
	}

}
