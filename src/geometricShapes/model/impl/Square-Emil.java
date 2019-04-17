package geometricShapes.model.impl;

import geometricShapes.model.Shape;

public class Square implements Shape {

	public String name = this.getClass().getSimpleName();
	private final double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	public String getName() {
		return name;
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

}
