package behavioral.visitor;

//Interface do Visitor
interface ShapeVisitor {
	void visit(Circle circle);

	void visit(Rectangle rectangle);
}
