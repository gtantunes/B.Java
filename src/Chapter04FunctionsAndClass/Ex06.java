package Chapter04FunctionsAndClass;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Ex06Calculator.circumference(radius);
        double v = Ex06Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Ex06Calculator.PI);

        sc.close();
    }
}
