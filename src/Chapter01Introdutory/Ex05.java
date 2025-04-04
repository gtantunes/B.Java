package Chapter01Introdutory;

// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codpeca1, numpeca1, codpeca2, numpeca2;
        double valpeca1, valpeca2, calculo1, calculo2;

        System.out.println("Insira o código, número, e o valor unitário da peça:");
        codpeca1 = sc.nextInt();
        numpeca1 = sc.nextInt();
        valpeca1 = sc.nextDouble();

        codpeca2 = sc.nextInt();
        numpeca2 = sc.nextInt();
        valpeca2 = sc.nextDouble();


        calculo1 = numpeca1 * valpeca1;
        calculo2 = numpeca2 * valpeca2;

        System.out.printf("Valor a pagar = R$%.2f%n", calculo1 + calculo2);

        sc.close();
    }
}
