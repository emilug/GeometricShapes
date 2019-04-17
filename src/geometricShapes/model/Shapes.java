package geometricShapes.model;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import geometricShapes.model.impl.Circle;
import geometricShapes.model.impl.Rectangle;
import geometricShapes.model.impl.Rhombus;
import geometricShapes.model.impl.Square;
import geometricShapes.model.impl.Triangle;

public class Shapes {

	public static void main(String[] args) {

		System.out.println("Please select the type of shape:");
		System.out.println("1. Circle");
		System.out.println("2. Square");
		System.out.println("3. Rhombus");
		System.out.println("4. Rectangle");
		System.out.println("5. Triangle");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		switch (i) {
		case 1:
			System.out.println("Please input the circle's radius:");
			int radius = sc.nextInt();
			calculateShapeValues(new Circle(radius));
			break;
		case 2:
			System.out.println("Please input the square's side:");
			int sqSide = sc.nextInt();
			calculateShapeValues(new Square(sqSide));
			break;
		case 3:
			System.out.println("Please input the Rhombus' side:");
			int rhSide = sc.nextInt();
			System.out.println("Please input an angle:");
			int rhAngle = sc.nextInt();
			calculateShapeValues(new Rhombus(rhSide, rhAngle));
			break;
		case 4:
			System.out.println("Please input the first side:");
			int recSide1 = sc.nextInt();
			System.out.println("Please input the second side:");
			int recSide2 = sc.nextInt();
			calculateShapeValues(new Rectangle(recSide1, recSide2));
			break;
		case 5:
			System.out.println("Please input the first side:");
			int trSide1 = sc.nextInt();
			System.out.println("Please input the second side:");
			int trSide2 = sc.nextInt();
			System.out.println("Please input the second side:");
			int trSide3 = sc.nextInt();
			calculateShapeValues(new Triangle(trSide1, trSide2, trSide3));
			break;
		}
	}

	public static void calculateShapeValues(Shape aShape) {
		System.out.println("The area for " + aShape.getSimpleName() + " is: " + aShape.calculateArea());
		System.out.println("The perimeter for " + aShape.getSimpleName() + " is: " + aShape.calculatePerimeter());
		System.out.println();
	}

}
