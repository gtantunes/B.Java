package Chapter03WhileAndFor;

import java.util.Locale;
import java.util.Scanner;

//Ler um número inteiro N e calcular todos os seus divisores.

public class Ex09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();


        for (int i = n; i > 0; i--) {
            if (n%i==0){
                System.out.println("Divisor: " + i);
            }
        }
        sc.close();
    }
}