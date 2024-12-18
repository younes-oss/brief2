public abstract class Personne {
    private static int compteurId = 1;
    private  int id ;
    private String nom,prenom,email;

    public Personne(int id,String nom, String prenom, String email){
        this.id=compteurId++;
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;

    }
}
