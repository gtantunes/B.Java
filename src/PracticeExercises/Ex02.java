package PracticeExercises;

import java.util.Locale;
import java.util.Scanner;

//Um programa que receba um número, esse número vai definir quantas vezes o programa repitirá.
//Para cada repetição, será solicitado três números ao usuário, pegue os 3 some, e mostre na tela.

public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de repetições: ");
        int n = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < n ; i++) {
            System.out.println("Primeiro valor: ");
            int a = sc.nextInt();
            System.out.println("Segundo valor: ");
            int b = sc.nextInt();
            System.out.println("Terceiro valor: ");
            int c = sc.nextInt();
            soma = a + b + c;

            System.out.println("Resultado: " + soma);
        }
        sc.close();
    }
}

