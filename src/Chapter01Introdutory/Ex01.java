package Chapter01Introdutory;

// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

import java.util.Locale;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int A, B, C, D, E, F, soma1, soma2, soma3;

        A = 10;
        B = 30;
        C = -30;
        D = 10;
        E = 0;
        F = 0;

        soma1 = (A + B);
        soma2 = (C + D);
        soma3 = (E + F);

        System.out.println("a soma de " + A + " com " + B + " é " + soma1);
        System.out.println("a soma de " + C + " com " + D + " é " + soma2);
        System.out.println("a soma de " + E + " com " + F + " é " + soma3);

    }
}
