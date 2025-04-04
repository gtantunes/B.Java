package PracticeExercises;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

//O programa deve gerar um número aleatório entre 1 e 100.
//Depois, peça para o usuário tentar adivinhar o número.
//Após cada tentativa, o programa deve dizer se o número digitado é maior ou menor do que o correto.
//O loop só termina quando o usuário acertar.

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int aleatorio = rd.nextInt(100) + 1;
        int n = 0;
        int soma = 0;
        do {
            System.out.print("Tente adivinhar o número: ");
            n = sc.nextInt();
            soma += 1;

            if (n < aleatorio) {
                System.out.println("Tente um número maior.");
            } else
                System.out.println("Tente um número menor.");

        } while (n != aleatorio);

        if (n == aleatorio) {
            System.out.println("Acertou!");
        }
        System.out.println("Suas tentativas totais: " + soma);

        sc.close();
    }
}

