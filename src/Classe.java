package brief2.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Classe  {
    Formateur formateur;
    static ArrayList<Apprenant> apprenants = new ArrayList();
    static ArrayList<Classe> classes = new ArrayList<>();

    private String nom;
    private int id;

    static private int counter = 1;

    public Classe(String nom) {
        this.formateur = null;
        this.nom = nom;
        this.id = counter;
        counter++;
    }

    public Classe() {
    }

    public int getID (){
        return this.id;
    }

    public String getName()
    {
        return this.nom;
    }
    public void setName(String nom){
        this.nom = nom;
    }






    static Scanner scanner = new Scanner(System.in);
    public static void ajouteclasse() {

        System.out.print("Entrez le nom de classe : ");
        String nom = scanner.next();

        System.out.println("-------------------------------");
        System.out.println("Classe ajouté avec succès ! ");
        System.out.println("-------------------------------");


        classes.add(new Classe(nom));
    }


    public static void afficherclasse() {

        for (int i = 0; i < classes.size(); i++) {
            System.out.println("\n\n\nles listes des classes");

            System.out.println("---------------------------");
            System.out.println("L'ID est : " + classes.get(i).getID());
            System.out.println("le nom est : " + classes.get(i).getName());

        }
    }


}
