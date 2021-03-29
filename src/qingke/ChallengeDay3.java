package qingke;

public class ChallengeDay3 {

	public static void main(String[] args) {
		
		String name ="weichangda";
		String from ="shaoxing";
		String like ="daqiu";
		String job = "chengxuyuan";

		System.out.println(del(name,from,like,job,"like"));
		System.out.println(update(name,from,like,job,"name","wangfeihong"));
		System.out.println(find(name,from,like,job,"job"));
	}
	public static String del(String name,String from,String like,String job,String del){
		if(del.equals("name")){
			return "from:"+from+",like:"+like+",job:"+job;
		}else if(del.equals("from")){
			return "name:"+name+",like:"+like+",job:"+job;
		}else if(del.equals("like")){
			return "name:"+name+",from:"+from+",job:"+job;
		}else if(del.equals("job")){
			return  "name:"+name+",from:"+from+",like:"+like;
		}else{
			return "«Î÷ÿ ‰£°";
		}
	}
	public static String update(String name,String from,String like,String job,String a,String b){
		if(a.equals("name")){
			return "name:"+b+",from:"+from+",like:"+like+",job:"+job;
		}else if(a.equals("from")){
			return "name:"+name+",from:"+b+",like:"+like+",job:"+job;
		}else if(a.equals("like")){
			return "name:"+name+",from:"+from+",like:"+b+",job:"+job;
		}else if(a.equals("job")){
			return "name:"+name+",from:"+from+",like:"+like+",job:"+b;
		}else{
			return "wrong!";
		}
	}
	public static String find(String name,String from,String like,String job,String a){
		if(a.equals("name")){
			return "name:"+name;
		}else if(a.equals("from")){
			return "from:"+from;
		}else if(a.equals("like")){
			return "like:"+like;
		}else if(a.equals("job")){
			return "job:"+job;
		}else{
			return "wrong";
		}
	}
}
