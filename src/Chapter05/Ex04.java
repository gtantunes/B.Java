package Chapter05;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, tempo;

        System.out.println("Digite a hora inicial do jogo: ");
        x = sc.nextInt();

        System.out.println("Digite a hora final do jogo: ");
        y = sc.nextInt();

        if (y > x) {
            tempo = y - x;
        } else {
            tempo = 24 - x + y;
        }
        if (tempo < 1 || tempo > 24) {
            System.out.println("O jogo não cumpriu a restrição de duração.");
        } else {
            System.out.println("O Jogo durou um total de " + tempo + " horas.");
        }

        sc.close();
    }
}
