package Chapter05;

//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
// seguir, calcule e mostre o valor da conta a pagar.

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int codigo, quantidade;
        double preco = 0, pagar = 0;


        System.out.println("Digite o código do produto: ");
        codigo = sc.nextInt();

        System.out.println("Agora, digite a quantidade: ");
        quantidade = sc.nextInt();

        if (codigo == 1) {
            preco = 4.00;
        } else if (codigo == 2) {
            preco = 4.50;
        } else if (codigo == 3) {
            preco = 5.00;
        } else if (codigo == 4) {
            preco = 2.00;
        } else if (codigo == 5) {
            preco = 1.50;
        } else {
            System.out.println("Produto não existente.");
        }

        if (codigo >= 1 && codigo <= 5) {
            pagar = quantidade * preco;
            System.out.printf("Valor a ser pago: R$%.2f%n", pagar);
        }

        sc.close();
    }
}
