package Chapter01Introdutory;

// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            double R, A, P = 3.14159;

         R = sc.nextDouble();
         A = P * R * R;

        System.out.printf("A=%.4f%n", A);


        sc.close();
    }

}
