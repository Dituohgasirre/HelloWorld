package qingke2;

public class Dealer extends Role{
	private playCards playcards;
	public Dealer(){
		super();
		 playcards = new  playCards();
	}
	//ϴ��
	public void shuffle(){
		playcards.shuffle();
		System.out.println("��ϴ��");
	}
	//����
	public void deal(Game game){
		
	}
}
