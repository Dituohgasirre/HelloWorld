package qingke1;

public class TestCircle {

	public static void main(String[] args) {
		Circle1 circle1 = new Circle1();
		Circle1 circle2 = new Circle1(6);

		double s1 = circle1.getArea();

		double s2 = circle2.getArea();
		double s3 = circle2.getCircumference();
		System.out.printf("%f\n%f\n%f\n", s1, s2, s3);
		System.out.println(circle1.toString());
	}

}
