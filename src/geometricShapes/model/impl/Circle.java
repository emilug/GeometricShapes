package geometricShapes.model.impl;

import geometricShapes.model.Shape;

public class Circle implements Shape {

	private final double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String getSimpleName() {
		return this.getClass().getSimpleName();
	}

}
