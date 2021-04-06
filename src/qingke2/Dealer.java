package qingke2;

public class Dealer extends Role{
	private playCards playcards;
	public Dealer(){
		super();
		 playcards = new  playCards();
	}
	//Ï´ÅÆ
	public void shuffle(){
		playcards.shuffle();
		System.out.println("ÒÑÏ´ÅÆ");
	}
	//·¢ÅÆ
	public void deal(Game game){
		
	}
}
