package qingke1;

public class Rectangle {
	private float length =1.0f;
	private float width=1.0f;
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		if(length>0){
			this.length = length;
		}
		
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		if(width>0){
			this.width = width;
		}
		
	}
	public Rectangle(){
		
	}
	public Rectangle(float length,float width){
		if (length > 0 && width>0){
			this.length=length;
			this.width=width;
		}else if(length>0&&width<=0){
			this.length=length;
			width=1.0f;
		}else if(length<=0&&width>0){
			length=1.0f;
			this.width=width;
		}
	}
	public double getArea(){
		return width*length;
	}
	public double getPerimeter(){
		return (width+length)*2;
	}
	public String toString(){
		return "Rectangle[length="+length+",width="+width+"]";
	}
	
	
}
