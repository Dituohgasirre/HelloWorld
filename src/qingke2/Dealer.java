package qingke2;

public class Dealer extends Role{
	private playCards playcards;
	

	public Dealer(){
		super();
		 playcards = new  playCards();
	}
	//洗牌
	public void shuffle(){
		playcards.shuffle();
		System.out.println("已洗牌");
	}
	//发牌
	public void deal(Gamer gamer){
		if(playcards.hasNext()){
			//玩家接牌
			gamer.getCard(playcards.nextCard());
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("发给"+gamer.getName()+"一张牌");

		}else{
			System.out.println("牌不够了");
		}
	}
	public void dealPart(){
		
	}
	
}
