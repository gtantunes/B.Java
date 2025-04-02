package PracticeExercises;

//Dado um array de números inteiros, encontre e exiba o maior e o menor número.

public class Ex09 {
    public static void main(String[] args) {


        int[] numeros = {4, 8, 1, 9, 3};
        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior){
                maior = numeros[i];
            }
            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }

        System.out.println("Maior número "+maior);
        System.out.println("Menor número "+menor);
    }
}
