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

    public static int getCompteurId() {
        return compteurId;
    }

    public static void setCompteurId(int compteurId) {
        Personne.compteurId = compteurId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
