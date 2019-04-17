package geometricShapes.model.impl;

import geometricShapes.model.Shape;

public class Triangle implements Shape {

	private final double side1;
	private final double side2;
	private final double side3;

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public double calculateArea() {
		return 0.25 * Math.sqrt(((side1 + side2 + side3) * (-side1 + side2 + side3) * (side1 - side2 + side3)
				* (side1 + side2 - side3)));
	}

	@Override
	public double calculatePerimeter() {
		return side1 + side2 + side3;
	}

	@Override
	public String getSimpleName() {
		return this.getClass().getSimpleName();
	}

}
