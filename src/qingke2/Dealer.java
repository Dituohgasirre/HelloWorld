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
	public void deal(Gamer gamer){
		if(playcards.hasNext()){
			//��ҽ���
			gamer.getCard(playcards.nextCard());
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("����"+gamer.getName()+"һ����");

		}else{
			System.out.println("�Ʋ�����");
		}
	}
	public void dealPart(){
		
	}
	
}
