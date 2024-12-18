import java.util.ArrayList;

public class Apprenant extends Personne{

    private Classe classe;
    private ArrayList<Double> notes;


    public Apprenant(int id ,String nom, String prenom, String email) {
        super(id,nom, prenom, email);

    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public ArrayList<Double> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Double> notes) {
        this.notes = notes;
    }
}
