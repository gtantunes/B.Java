package Chapter02IfElse;

//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double valor;

        System.out.println("Insira um valor qualquer: ");
        valor = sc.nextDouble();

        if (valor >= 0 && valor <= 25) {
            System.out.printf("Está no intervalo de [0,25]");
        } else if (valor > 25 && valor <= 50) {
                System.out.println("Está no intervalo de [25,50]");
        } else if (valor > 50 && valor <= 75) {
                System.out.println("Está no intervalo de [50,75]");
        } else if (valor > 75 && valor <= 100.00) {
            System.out.println("Está no intervalo de [75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

    sc.close();
    }
}
