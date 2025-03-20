package Chapter04;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = 5, B = 6, C = 7, D = 8, dif;

        dif = A * B - C * D;

        sc.nextInt();

        System.out.println("Diferença = " + dif);

        sc.close();
    }
}
