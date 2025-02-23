package Java_06_OOPDesignPattern;

interface ShapeOfObject {
    void draw();
}

class Rectangle implements ShapeOfObject {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Circle implements ShapeOfObject {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class RoundedRectangle implements ShapeOfObject {
    @Override
    public void draw() {
        System.out.println("Drawing a Rounded Rectangle");
    }
}

class RoundedCircle implements ShapeOfObject {
    @Override
    public void draw() {
        System.out.println("Drawing a Rounded Circle");
    }
}

abstract class AbstractFactory {
    abstract ShapeOfObject getShape(String shapeType);
}

class ShapeFactory extends AbstractFactory {
    @Override
    ShapeOfObject getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        return null;
    }
}

class RoundedShapeFactory extends AbstractFactory {
    @Override
    ShapeOfObject getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new RoundedCircle();
        }
        return null;
    }
}

class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}

public class Java_04_19_AbstractFactoryPattern {
    public static void main(String[] args) {
        System.out.println("Abstract Factory Pattern");
        System.out.println("=======================");

        // Create a normal shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        ShapeOfObject rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        ShapeOfObject circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        // Create a rounded shape factory
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
        ShapeOfObject roundedRectangle = roundedShapeFactory.getShape("RECTANGLE");
        roundedRectangle.draw();

        ShapeOfObject roundedCircle = roundedShapeFactory.getShape("CIRCLE");
        roundedCircle.draw();

    }
}
