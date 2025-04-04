package Chapter03WhileAndFor;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".


public class Ex07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double result;

            if (b == 0){
                System.out.println("Divisão Impossível.");
            }else{
                result = a / b;
                System.out.println("Saída: "+ result);
            }
        }

        sc.close();
    }
}
