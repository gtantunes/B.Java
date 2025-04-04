package Chapter04FunctionsAndClass;

//Cálculo de área, perimetro e diagonal de um retângulo com funções e classes.

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Ex03Rectangle rectangle = new Ex03Rectangle();

        System.out.println("Enter rectangle width amd height:");

        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println();
        System.out.printf("Area = %.2f%n", rectangle.area());
        System.out.printf("Perimeter = %.2f%n", rectangle.perimeter());
        System.out.printf("Diagonal = %.2f%n", rectangle.diagonal());

        sc.close();
    }
}
