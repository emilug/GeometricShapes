package geometricShapes.model.impl;

import geometricShapes.model.Shape;

public class Rectangle implements Shape {

	public Rectangle(double side1, double side2) {
		this.side1 = side1;
		this.side2 = side2;
	}

	private final double side1;
	private final double side2;

	
	@Override
	public double calculateArea() {
		return side1 * side2;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * (side1 + side2);
	}

	@Override
	public String getSimpleName() {
		return this.getClass().getSimpleName();
	}

}
