package Java_06_OOPDesignPattern;

public class Java_06_03_prototypePattern {
    public static void main(String[] args) {

        Shape circlePrototype = new Circle("red");

        ShapeClient client = new ShapeClient(circlePrototype);

        Shape redCircle = client.createShape();

        redCircle.draw();
    }
}
// Prototype interface
interface Shape {
    Shape clone();  // Make a copy of itself
    void draw();    // Draw the shape
}

// Concrete prototype
class Circle implements Shape {
    private String color;

    // When you create a circle, you give it a color.
    public Circle(String color) {
        this.color = color;
    }

    // This creates a copy of the circle.
    @Override
    public Shape clone() {
        return new Circle(this.color);
    }

    // This is how a circle draws itself.
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle.");
    }
}

// Client code
class ShapeClient {
    private Shape shapePrototype;

    // When you create a client, you give it a prototype (a shape).
    public ShapeClient(Shape shapePrototype) {
        this.shapePrototype = shapePrototype;
    }

    // This method creates a new shape using the prototype.
    public Shape createShape() {
        return shapePrototype.clone();
    }
}

