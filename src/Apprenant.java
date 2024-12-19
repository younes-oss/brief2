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

            System.out.println("id : " +apprenants.get(i).getId()+" full name : "+ apprenants.get(i).getNom() +" "+ apprenants.get(i).getPrenom()+" email: " + apprenants.get(i).getEmail());

        }
    }



}
