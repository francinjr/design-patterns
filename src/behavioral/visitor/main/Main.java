package behavioral.visitor.main;


import behavioral.visitor.AreaCalculator;
import behavioral.visitor.Circle;
import behavioral.visitor.PerimeterCalculator;
import behavioral.visitor.Rectangle;
import behavioral.visitor.Shape;

public class Main {
 public static void main(String[] args) {
     Shape circle = new Circle(3);
     Shape rectangle = new Rectangle(4, 6);

     AreaCalculator areaCalculator = new AreaCalculator();
     PerimeterCalculator perimeterCalculator = new PerimeterCalculator();


     circle.accept(areaCalculator);
     circle.accept(perimeterCalculator);
     
     System.out.println("Área do circulo: " + areaCalculator.getArea());
     System.out.println("Perimetro do circulo: " + perimeterCalculator.getPerimeter());


     
     rectangle.accept(areaCalculator);
     rectangle.accept(perimeterCalculator);
     System.out.println("Área do retângulo: " + areaCalculator.getArea());
     System.out.println("Perimetro do retangulo: " + perimeterCalculator.getPerimeter());
 }
}
