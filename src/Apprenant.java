package brief2.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Apprenant extends Personne{
     static Scanner scanner = new Scanner(System.in);

    private Classe classe;
    private ArrayList<Double> notes;
    private  ArrayList<Apprenant> apprenants=new ArrayList<>();

    public Apprenant( String nom, String prenom, String email) {
        super(nom, prenom, email);

    }
    public Apprenant(){
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

    public  void ajouterApprenant(){

        System.out.print("votre nom : ");
        String firstName = scanner.next();
        System.out.print("\n votre prenom : ");
        String lastName = scanner.next();
        System.out.print("\n votre email : ");
        String email = scanner.next();
        apprenants.add(new Apprenant(firstName,lastName,email));

    }
    public void modiferApprenant(){
        if(apprenants.isEmpty()){
            System.out.print("la liste est vide");
        }
        System.out.print("entrer l'id de l'apprenant que vous voulez modifier");
        int id =scanner.nextInt() ;

        for (int i =0 ;i<apprenants.size();i++){
            if(id ==apprenants.get(i).getId()){
                System.out.print("votre nom : ");
                String firstName = scanner.next();
                System.out.print("\n votre prenom : ");
                String lastName = scanner.next();
                System.out.print("\n votre email : ");
                String email = scanner.next();
                //Apprenant apprenant =new Apprenant();
//                apprenant.setPrenom(firstName);
//                apprenant.setNom(lastName);
//                apprenant.setEmail(email);
                apprenants.get(i).setNom(firstName);
                apprenants.get(i).setPrenom(lastName);
                apprenants.get(i).setEmail(email);
            }
        }

    }

    public void AfficherApprenant(){

        for(int i =0 ; i<apprenants.size();i++){
            int compteur = 1;
            compteur+=i;
            System.out.print("------------Apprenant"+compteur+"--------------\n");
            System.out.println("       id : " +apprenants.get(i).getId()+"\n" +
                    "       full name : "+ apprenants.get(i).getNom() +" "+ apprenants.get(i).getPrenom()+"\n" +
                    "       email: " + apprenants.get(i).getEmail());

        }
    }

    public void supprimerApprenant(){

        if(apprenants.isEmpty()){
            System.out.print("la liste est vide");
            return;
        }
        System.out.print("entrer l'id de l'apprenant que vous voulez supprimer");
        int choix;
        choix=scanner.nextInt();
        int apprenantId = 0;
        boolean trouve = false;
        for(int i = 0; i<apprenants.size();i++){
            if(choix == apprenants.get(i).getId()){
            apprenantId=  apprenants.indexOf(apprenants.get(i) );
            apprenants.remove(apprenantId);
            System.out.println("supprimée avec succées");
            trouve=true;
            }
        }
        if(!trouve) {
            System.out.println("ce apprenant n'est existe pas\n");
        }
    }

}
