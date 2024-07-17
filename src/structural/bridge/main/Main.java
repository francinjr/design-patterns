package structural.bridge.main;

import structural.bridge.Color;
import structural.bridge.GreenColor;
import structural.bridge.Pentagon;
import structural.bridge.RedColor;
import structural.bridge.Shape;
import structural.bridge.Triangle;

public class Main {
    public static void main(String[] args) {
        Color red = new RedColor();
        Color green = new GreenColor();

        Shape triangle = new Triangle(red);
        Shape pentagon = new Pentagon(green);

        triangle.draw();
        pentagon.draw();
    }
}
