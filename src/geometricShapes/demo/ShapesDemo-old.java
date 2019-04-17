package geometricShapes.demo;

import geometricShapes.model.Shape;
import geometricShapes.model.impl.Circle;
import geometricShapes.model.impl.Square;

public class ShapesDemo {

	public static void main(String[] args) {
		// method 1:
		Circle aCircle = new Circle(3);
		Square aSquare = new Square(4);

		// method 2 - here we have an example of polimorphism (forced):
		Shape shape1 = new Circle(3);
		Shape shape2 = new Square(4);
		System.out.println("'aCircle' has the area: " + aCircle.calculateArea());
		System.out.println("'aSquare' has the perimeter: " + aSquare.calculatePerimeter());
		System.out.println("'shape1' has the perimeter: " + shape1.calculatePerimeter());
		System.out.println("'shape2' has the area: " + shape2.calculateArea());
	}

}
