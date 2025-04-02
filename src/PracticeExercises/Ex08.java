package PracticeExercises;

//Crie um array com 5 números inteiros e calcule a soma de todos os elementos.

public class Ex08 {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];

        }
        System.out.println("Soma: "+ soma);
    }
}
