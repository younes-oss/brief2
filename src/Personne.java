package brief2.src;

public abstract class Personne {

    private static int compteurId = 1; // Compteur global pour générer des IDs uniques
    private int id; // ID unique pour chaque instance
    private String nom;
    private String prenom;
    private String email;

    // Constructeur
    public Personne(String nom, String prenom, String email) {
        this.id = compteurId; // Générer un ID unique
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        compteurId++;
    }
    public Personne(){}

    // Getters
    public int getId() {
        return this.id; // Retourne l'ID unique de l'instance
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {return prenom;}

    public String getEmail() {
        return email;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
