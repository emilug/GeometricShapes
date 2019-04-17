package geometricShapes.model.impl;

import geometricShapes.model.Shape;

public class Square implements Shape {

	private final double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public double calculateArea() {
		return side * side;
		// return Math.pow(side, 2);
	}

	@Override
	public double calculatePerimeter() {
		return side * 4;
	}

	@Override
	public String getSimpleName() {
		return this.getClass().getSimpleName();
	}

}
