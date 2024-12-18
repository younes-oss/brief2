import java.util.ArrayList;

public class Apprenant extends Personne{

    private Classe classe;
    private ArrayList<Double> notes;

    public Apprenant(int id ,String nom, String prenom, String email,Classe classe) {
        super(id,nom, prenom, email);
        this.classe=classe;
        this.notes=new ArrayList<>();


    }
}
