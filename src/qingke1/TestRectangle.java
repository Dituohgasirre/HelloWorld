package qingke1;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rectangle =new Rectangle();
		rectangle.setLength(-2);
		rectangle.setWidth(2);
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPerimeter());
		System.out.println(rectangle.toString());
	}

}
