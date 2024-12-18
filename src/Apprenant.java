import java.util.ArrayList;
import java.util.Scanner;

public class Apprenant extends Personne{

    private Classe classe;
    private ArrayList<Double> notes;
    private  ArrayList<Apprenant> apprenants=new ArrayList<>();



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

    public void ajouter(){
        int id=Personne.getId();
        id=id++;
        System.out.print("votre nom : \n");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        System.out.print("votre prenom : \n");
        String lastName = scanner.next();
        System.out.print("votre email : \n");
        String email = scanner.next();

        apprenants.add(new Apprenant(id,firstName,lastName,email));

    }
}
