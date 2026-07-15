public class Image {
	private String name ;
	private int width ;
	private int height ;
	public Image ( String name , int width , int height ){
		this.name=name ;
		this.width=width ;
		this.heigh=heigh ;
	}
	public void display(){
		System.out.println( "显示图片"+name ) ;
	}
	public int getSize(){
		return width*height ;
	}
}