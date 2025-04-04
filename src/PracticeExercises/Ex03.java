package PracticeExercises;

import java.util.Locale;
import java.util.Scanner;

//Crie um programa que use um do-while para imprimir os números de 1 a 10.

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int contador = 1;

        do {
            System.out.println(contador);
            contador += 1;

        }while (contador <=10);
    }
}

