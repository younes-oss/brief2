public class Formateur extends Personne {
    private String specialite;
    private double salaire;
    private Classe classe;



    public Formateur( String nom, String prenom, String email,String specialite,double salaire,Classe classe) {
        super(nom, prenom, email);
        this.specialite=specialite;
        this.salaire=salaire;
        this.classe=classe;
    }
}
