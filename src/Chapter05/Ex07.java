package Chapter05;

//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).

//Se o ponto estiver na origem, escreva a mensagem “Origem”.

//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double x, y;

        System.out.println("Insira o primeiro valor:");
        x = sc.nextDouble();
        System.out.println("Insira o segundo valor:");
        y = sc.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Quadrante Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante Q4");
        } else if (x == 0 && y == 0) {
            System.out.println("Ponto de origem.");
        } else if (x == 0 && y > 0) {
            System.out.println("Eixo X.");
        } else {
            System.out.println("Eixo Y.");
        }
    }
}
