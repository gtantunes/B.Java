package Chapter04FunctionsAndClass;

//Cálculo que mostra se o aluno foi aprovado ou não, e se não, dizer quantos pontos faltam.

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Ex05StudentSituation student = new Ex05StudentSituation();

        System.out.println("Enter the student data: ");
        System.out.print("Name: ");
        student.name = sc.nextLine();

        System.out.print("First Test's note: ");
        student.proof_note1 = sc.nextDouble();

        System.out.print("Second Test's note: ");
        student.proof_note2 = sc.nextDouble();

        System.out.print("Third Test's note: ");
        student.proof_note3 = sc.nextDouble();

        System.out.printf("Final Grade = %.2f%n", student.FinalGrade());
        if (student.FinalGrade() >= 60){
            System.out.println("PASS");
        } else {
            System.out.println("FAILED\nMISSING " + student.MinimalPoints() + " POINTS");
        }
        sc.close();
    }
}
