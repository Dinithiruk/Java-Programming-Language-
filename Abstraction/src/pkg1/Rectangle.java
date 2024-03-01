package pkg1;


public class Rectangle extends Shapes{
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.drawShape();
		r.colorShape();
		r.moveShape();
	}
	@Override
	public void drawShape() {
		System.out.println("Drawing Rectangle");
		
	}
	
	@Override
	public void colorShape() {
		System.out.println("Coloring rectangle");
	}
	
	@Override
	public void moveShape() {
		System.out.println("Moving Rectangle"); 
	}
	
}
