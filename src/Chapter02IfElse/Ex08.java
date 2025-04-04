package Chapter02IfElse;

//Calculadora de imposto

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite seu salário em R$: ");
        double salario = sc.nextDouble();
        double imposto;

        if (salario <= 2000.00) {
            System.out.println("Isento de imposto.");
        }
        else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("Deverá pagar R$ %.2f%n", imposto);
        }
        else if (salario <= 4500.00) {
            imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
            System.out.printf("Deverá pagar R$ %.2f%n", imposto);
        }
        else {
            imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
            System.out.printf("Deverá pagar R$ %.2f%n", imposto);
        }

        sc.close();
    }
}