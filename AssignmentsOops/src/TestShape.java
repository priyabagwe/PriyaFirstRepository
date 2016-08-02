
public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  double width = 4, length = 6;
	      Shape rectangle = new Rectangle(width, length);
	       System.out.println("Rectangle width: " + width + " and length: " + length
	              + "\nResulting area: " + rectangle.area()
	              + "\nResulting perimeter: " + rectangle.perimeter() + "\n");

	        double radius = 6;
	        Shape circle =  new Circle(radius);
	        System.out.println("Circle radius: " + radius
	            + "\nResulting Area: " + circle.area()
	            + "\nResulting Perimeter: " + circle.perimeter() + "\n");

		
	}

}
