package Chapter03;

import java.util.Locale;
import java.util.Scanner;

//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1.

public class Ex08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int n = sc.nextInt();
        int fatorial = n;

        for (int i = 1; i < n; i++) {
            fatorial *= (n - i);
        }

        System.out.println("Fatorial: " + fatorial);

        sc.close();
    }
}
