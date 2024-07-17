package behavioral.visitor;

//Implementações de operações (Visitantes)
public class AreaCalculator implements ShapeVisitor {
	double area = 0;

	@Override
	public void visit(Circle circle) {
		area = Math.PI * circle.getRadius() * circle.getRadius();
	}

	@Override
	public void visit(Rectangle rectangle) {
		area = rectangle.getWidth() * rectangle.getHeight();
	}

	public double getArea() {
		return area;
	}
}
