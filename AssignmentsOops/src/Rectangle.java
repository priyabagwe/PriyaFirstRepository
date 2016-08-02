
public class Rectangle extends Shape {
	 private final double width, length; 

	    public Rectangle() {
	        this(1,1);
	    }
	    public Rectangle(double width, double length) {
	        this.width = width;
	        this.length = length;
	    }

	    @Override
	    public double area() {
	        //formula for area  A = w * l
	        return width * length;
	    }

	    @Override
	    public double perimeter() {
	        //formula for perimeter P = 2(w + l)
	        return 2 * (width + length);
	    }
		@Override
		public int noOfSides() {
			// TODO Auto-generated method stub
			return 2;
		}

	}


