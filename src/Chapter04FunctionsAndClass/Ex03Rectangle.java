package Chapter04FunctionsAndClass;

public class Ex03Rectangle {

    double width;
    double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2.0 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt((width * width) + (height * height));
    }
}
