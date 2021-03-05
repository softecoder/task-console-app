public class ShapeFactory {
    private static final int CIRCLE = 1;
    private static final int SQUARE = 2;

    public static Shape createShape(int shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
            default -> throw new IllegalStateException("Invalid Shape type: " + shapeType);
        };
    }
}
