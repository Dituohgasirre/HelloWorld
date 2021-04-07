package qingke2;

public class Table {
	public Dealer dealer =new Dealer();
	public Gamer[] gamers=new Gamer[10];
	public int num=0;
	
	public void add(){
		if(num>10)
			System.out.println("�����������޷���������");
		else{
			Gamer gamer=new Gamer();
			for(int i=0;i<gamers.length;i++){
				if(gamers[i]==null){
					gamers[i]=gamer;
					break;
				}
			}
			num++;
		}
	}
	public void add(Gamer gamer){
		if(num>10)
			System.out.println("����������["+gamer.getName()+"]�޷�������Ϸ");
		else{
			for(int i=0;i<gamers.length;i++){
				if(gamers[i]==null){
					gamers[i]=gamer;
					break;
				}
			}
			num++;
		}
	}


	
	public void dealPart(){
		for(int i=0,count=1;i<5;i++){
			for(int j=0;j<gamers.length;j++){
				if(gamers[j]!=null){
					System.out.println("��"+count+"��");
					count++;
					dealer.deal(gamers[j]);
				}
			}
			System.out.println("");
		}
	}
	public void flopPart(){
		
	
	
		for(int i=0;i<gamers.length;i++){
			if(gamers[i]!=null){
				System.out.print(gamers[i].getName()+":");
				gamers[i].look();
				System.out.println("------------------------------------");
			}
		}
		System.out.println("");
	}

	 
	public void lookPart(){
		gamers[0].look();
		System.out.println("");
	}

	public void shufflePart(){
		dealer.shuffle();
		System.out.println("");
	}
	
	public void start(){
		if(num<2){
			System.out.println("���������޷���Ϸ");
			return;
		}
		shufflePart();
		dealPart();
		lookPart();
		 flopPart();
	}
}
