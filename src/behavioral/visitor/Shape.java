package behavioral.visitor;

//Interface para elementos visitáveis
public interface Shape {
 void accept(ShapeVisitor visitor);
}
