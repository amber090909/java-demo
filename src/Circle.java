public class Circle implements Shape {
	private double r ;

	public Circle (double r) {
		this.r = r ;
	}

	@Override
	public double getArea() {
		return Math.PI * r * r ;
	}

	@Override
	public double getPerimeter() {
		return Math.PI * 2 * r ;
	}
}