package PracticeExercises;

import java.util.Locale;
import java.util.Scanner;

//Peça para o usuário inserir um número e, usando do-while, exiba a tabuada desse número (de 1 a 10).

public class Ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int t = sc.nextInt();
        int n = 1;

        do {
            System.out.printf("%d x %d = %d%n", t, n, t * n);
            n+=1;
        } while (n <= 10);

        sc.close();
    }
}
