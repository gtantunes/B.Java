package Chapter03;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//exemplo.


public class Ex10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um número:");
        int n = sc.nextInt();
        int quadrado = 0;
        int cubo = 0;

        for (int i = 1; i <= n; i++) {
            quadrado = i*i ;
            cubo = i*i*i;
            System.out.printf("%d %d %d%n", i, quadrado, cubo);
        }
        sc.close();
    }
}
