package Chapter04;

// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

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
