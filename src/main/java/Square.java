public class Square extends Shape {
    private double side;

    public Square() {
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}
