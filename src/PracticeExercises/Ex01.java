package PracticeExercises;

// Crie um tipo de roleta onde ela use um número aleatorio como
// bilhete premiado. Caso acerte, imprima uma mensagem positiva, se não, tente novamente.

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Escolha quantas vezes quer tentar:");
        int repeticao = sc.nextInt();

        System.out.println("Escolha um número aleatório para o programa:");
        int valor= sc.nextInt();

        for (int i = 0; i < repeticao; i++) {

            System.out.println("Tente adivinhar o número sorteado!");
            int sorteado = sc.nextInt();

            int programa = rd.nextInt(valor)+1;
            System.out.println("Número máximo do programa: "+ programa);

            if (sorteado == programa) {
                System.out.println("Parabéns\n");
            } else {
                System.out.println("Tente novamente...\n");
            }
        }
        sc.close();
    }
}