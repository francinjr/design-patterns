package behavioral.visitor;

public class PerimeterCalculator implements ShapeVisitor {
    double perimeter = 0;

    @Override
    public void visit(Circle circle) {
        perimeter = 2 * Math.PI * circle.getRadius();
    }

    @Override
    public void visit(Rectangle rectangle) {
        perimeter = 2 * rectangle.getWidth() + 2 * rectangle.getHeight();
    }

    public double getPerimeter() {
        return perimeter;
    }
}
