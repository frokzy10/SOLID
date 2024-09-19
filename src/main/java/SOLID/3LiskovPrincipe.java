package SOLID;

interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
class Square implements Shape {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}

class Main3 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(30,20);
        Shape square = new Square(5);

        System.out.println("прямоугольник: " + rectangle.getArea());
        System.out.println("квадрат: " + square.getArea());
    }
}