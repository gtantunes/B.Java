package PracticeExercises;

import java.util.Locale;
import java.util.Scanner;

//Peça ao usuário para digitar números inteiros.
//Some todos os números digitados e pare o loop quando o usuário inserir um número negativo. No final, mostre a soma total.

public class Ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int soma = 0;

        do {
            System.out.print("Digite um número: ");
            n = sc.nextInt();
            if (n >=0) {
                soma +=n;
            }
        } while (n >=0);
        System.out.println("Soma total: "+ soma);


        sc.close();
    }
}
