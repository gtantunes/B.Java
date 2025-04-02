package Chapter01;

//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
// decimais.

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);


                    int NF, HT;
                    double VH, salario;



                        NF = sc.nextInt();
                        HT = sc.nextInt();
                        VH = sc.nextDouble();

                        salario = HT * VH;

        System.out.println("Número = " + NF);
        System.out.printf("salario = U$ %.2f%n", salario);


            sc.close();
    }
}
