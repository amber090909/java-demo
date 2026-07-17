public class Main {
	public static void main(String[] args){
		Shape c = new Circle(5);
		Shape r = new Rectangle(4,6);
		System.out.println( "圆面积:"+c.getArea() );
		System.out.println( "矩形面积:"+r.getArea() );
		Image image = new Image("cat.png",800,600);
		image.display();
		System.out.println("图片大小："+image.getSize());
		Shape t = new Triangle(3,4,5);
		System.out.println( t.getArea());
		System.out.println(t.getPerimeter());
	}
}
