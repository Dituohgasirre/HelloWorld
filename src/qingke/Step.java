package qingke;
/**
 * 跳台阶问题，总共有n级，如果一次可以跳1级，也可以跳2级，求总共有多少种跳法。
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
