public class Main {
	public static void main(String[] args){
	Shape c = new Circle(5);
	Shape r = new Rectangle(4,6);
	System.out.println( "圆面积:"+c.getArea() );
	System.out.println( "矩形面积:"+r.getArea() );
	}
}