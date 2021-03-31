package qingke1;

import java.util.Arrays;

public class Book {
	private String name;
	private Author[] author;
	private double price;
	private int qty=0;
	
	public Book(String name,Author[] author,double price){
		this.name=name;
		this.author=author;
		this.setPrice(price);
	}
	public Book(String name,Author[] author,double price,int qty){
		this.name=name;
		this.author=author;
		this.setPrice(price);
		this.setQty(qty);
	}
	public String getName(){
		return name;
	}
	public Author[] getAuthors(){
		
		return author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString(){
		String[] s=new String[author.length];
		for(int i=0;i<author.length;i++){
			
			s[i]= "Book[name="+name+",authors={"+"Author[name="+author[i].getName()+",email="+author[i].getEmail()+",gender="+author[i].getGender()+"],},price="+price+",qty="+qty+"]";
		}
		return Arrays.toString(s);
	}
	public String getAuthorNames(){
		String[] s=new String[author.length];
		for(int i=0;i<author.length;i++){
			s[i]=author[i].getName();
		}
		return Arrays.toString(s);
	}
	
	
}
