public class Circle implements Shape {
	private double r ;
	private String color;

	public Circle (double r,String color) {
		this.r = r ;
		this.color=color ;
	}

	public Circle (double r) {
		this.r = r ;
	}
	
	public void showColor(){
		System.out.println("颜色"+color);
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