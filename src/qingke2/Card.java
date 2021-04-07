package qingke2;

public class Card {
	private String facevalue;//面值
	private String color;//面值花色
	private int value;//实际大小
	private int number;//数字
	private Suit suit;//花色
	
	public static final Suit[] allSuits={Suit.CLUB,Suit.DIAMOND,Suit.HEART,Suit.SPADE,Suit.NOSUIT};
	public static final String[] colors={"♣","♦","♥","♠",""};
	
	public Card(int value){
		if(value<=54&&value>=1){
			this.value=value;
			initializeNumber();
			initializeFacevalue();
			initializeColor();
		}else{
			System.out.println("扑克牌生成失败，请输入正确的数值");
		}
	}
	
	private void initializeNumber(){
		if(value<=36){
			number=(value-1)/4+1;
		}else{
			number=10;
		}
	}
	private void initializeFacevalue(){
		if(value==54){
			facevalue="大王";
		}else if(value==53){
			facevalue="小王";
		}else if(value>=49&&value<=52){
			facevalue="K";
		}else if(value>=45&&value<=48){
			facevalue="Q";
		}else if(value>=41&&value<=44){
			facevalue="J";
		}else if(value>=5&&value<=40){
			facevalue=""+((value-1)/4+1);
		}else{
			facevalue="A";
		}
	}
	private void initializeColor(){
		if(value>52){
			suit=allSuits[4];
			color="";
		}else{
			suit=allSuits[ (value-1)%4];
			color=colors[(value-1)%4];
		}
	}
	public int getNumber(){
		return number;
	}
	public String getFacevalue(){
		return facevalue;
	}
	public String getColor(){
		return color;
	}
	public int getValue(){
		return value;
	}
	public Suit getSuit(){
		return suit;
	}
	public String toString(){
		return "["+color+facevalue+"]";
	}


}
