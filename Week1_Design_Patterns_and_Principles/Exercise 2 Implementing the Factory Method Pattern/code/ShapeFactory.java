public class ShapeFactory {
    public Shape getShape(String type) {
        if (type == null) return null;
        if (type.equalsIgnoreCase("CIRCLE")) return new Circle();
        if (type.equalsIgnoreCase("SQUARE")) return new Square();
        if (type.equalsIgnoreCase("TRIANGLE")) return new Triangle();
        return null;
    }
}
