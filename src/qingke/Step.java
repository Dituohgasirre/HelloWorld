package qingke;
/**
 * ��̨�����⣬�ܹ���n�������һ�ο�����1����Ҳ������2�������ܹ��ж�����������
 * @author wcd
 *
 */
public class Step {

	public static void main(String[] args) {
	
	}
	public static int jumpStep(int n){
		if(n==1){
			return 1;
		}else if(n==2){
			return 2;
		}else{
			return jumpStep(n-1)+jumpStep(n-2);
		}
	}

}
