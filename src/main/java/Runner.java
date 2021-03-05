import java.util.Scanner;

/**
 * Runner class for demo.
 */
public class Runner {
    public static void main(String[] args) {
        runConsoleApplication();
    }

    private static void runConsoleApplication() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            Shape shape = inputShapeType(sc);
            shape = initShapeParameters(shape, sc);
            exit = printArea(shape, sc);
        }
    }

    public static boolean printArea(Shape shape, Scanner sc) {
        double area = shape.calculateArea();
        System.out.println("Area of your shape is: " + area);
        System.out.println("""
                for exit press 0
                for continue press 3
                """);
        return sc.nextInt() == 0;
    }

    private static Shape initShapeParameters(Shape shape, Scanner sc) {
        if (shape instanceof Circle) {
            System.out.println("""
                    Input radius Circle:
                    """);
            int radius = sc.nextInt();
            Circle circle = (Circle) shape;
            circle.setRadius(radius);
            return circle;
        } else {
            System.out.println("""
                    Input side of Square:
                    """);
            int side = sc.nextInt();
            Square square = (Square) shape;
            square.setSide(side);
            return square;
        }
    }

    private static Shape inputShapeType(Scanner sc) {
        System.out.println("""
                Choose Shape type:
                for creation Circle press 1
                for creation Square press 2
                """);
        int input = sc.nextInt();
        return ShapeFactory.createShape(input);
    }
}
