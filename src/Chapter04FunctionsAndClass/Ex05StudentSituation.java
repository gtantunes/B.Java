package Chapter04FunctionsAndClass;

public class Ex05StudentSituation {
    String name;
    double proof_note1;
    double proof_note2;
    double proof_note3;

    public double FinalGrade(){
       return proof_note1 + proof_note2 + proof_note3;
    }

    public double MinimalPoints() {
        return 60 - FinalGrade() ;
    }
}
