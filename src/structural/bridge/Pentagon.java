package structural.bridge;

public class Pentagon implements Shape {
    private Color color;

    public Pentagon(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a pentagon in " + color.fill() + " color.");
    }
}
