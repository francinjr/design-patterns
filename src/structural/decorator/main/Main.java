package structural.decorator.main;

import structural.decorator.Circle;
import structural.decorator.Rectangle;
import structural.decorator.RedShapeDecorator;
import structural.decorator.Shape;

public class Main {
	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());

		circle.draw();
		redCircle.draw();
		redRectangle.draw();
	}
}
