package brief2.src;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Formateur extends Personne {
    private String specialite;
    private double salaire;
    private Classe classe;
    private ArrayList<Formateur> formateurs =new ArrayList<>();



    public Formateur( String nom, String prenom, String email,String specialite,double salaire) {
        super(nom, prenom, email);
        this.specialite=specialite;
        this.salaire=salaire;
        this.classe=classe;
    }
    public Formateur(){}


    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    public void ajouterFormrateur(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("votre nom : ");
        String firstName = scanner.next();
        System.out.print("\n votre prenom : ");
        String lastName = scanner.next();
        System.out.print("\n votre email : ");
        String email = scanner.next();
        System.out.print("\n votre specialite : ");
        String specialite = scanner.next();
        System.out.print("\n votre salaire : ");
        double Salaire = scanner.nextDouble();

        formateurs.add(new Formateur(firstName,lastName,email,specialite,Salaire));
    }

    public void afficherFormateur(){
        for(int i = 0 ; i<formateurs.size();i++){
            if(formateurs.isEmpty()){
                System.out.println("la liste des formateurs est vide" );
            }
        }
        for(int i =0 ; i<formateurs.size();i++){
            int compteur = 1;
            compteur+=i;
            System.out.print("------------Apprenant"+compteur+"--------------\n");
            System.out.println("       id : " +formateurs.get(i).getId()+"\n" +
                    "       full name : "+ formateurs.get(i).getNom() +" "+ formateurs.get(i).getPrenom()+"\n" +
                    "       email: " + formateurs.get(i).getEmail());

        }
    }


}
