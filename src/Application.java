package brief2.src;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {
    static  ArrayList<Formateur> formateurs = new ArrayList<>();
    static ArrayList<Apprenant> apprenants = new ArrayList<>();
    static ArrayList<Formateur> classes = new ArrayList<>();


    public static void main(String[] args) {

        int choix = 0;
        Scanner scanner = new Scanner(System.in);

        while (choix != 4) {

            System.out.println("1.\" Gestion de Systeme Apprenant \"");
            System.out.println("2.\" Gestion de Systeme Fomrmateur \"");
            System.out.println("3.\" Gestion de Systeme Classe \"");
            System.out.println("4.\" Quitter \"");
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    menuApprenant();
                    break;
                case 2:
                    menuFormateur();
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void menuApprenant() {
        int choix = 0;
        Apprenant apprenant = new Apprenant();
        Scanner scanner = new Scanner(System.in);
        while (choix != 6) {
            System.out.println("   ***********************************************");
            System.out.println("   *  1.\" Ajouter un Apprenant a une classe \"  *");
            System.out.println("   *  2.\"Associer un Apprenant a une classe \"  *");
            System.out.println("   *  3.\" modifier un Apprenant \"              *");
            System.out.println("   *  4.\" afficher un Apprenant \"              *");
            System.out.println("   *  5.\" supprimer un Apprenant \"             *\n" +
                    "   *  6.\" retourner a la liste principale\"     *");

            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    apprenant.ajouterApprenant();
                    break;
                case 2:
                    break;
                case 3:
                    apprenant.modiferApprenant();
                    break;
                case 4:
                    apprenant.AfficherApprenant();
                    break;
                case 5:
                    apprenant.supprimerApprenant();
                    break;
                case 6:
                    System.out.println("\" voila la liste principale \" \n");
                    break;
            }
        }
    }

    public static void menuFormateur() {
        Formateur formateur = new Formateur();
        Scanner scanner = new Scanner(System.in);
        int choix = 0;
        while (choix != 6) {
        System.out.print("-----------------Gestion des Formateurs-----------------\n" +
                "     |\"    1.ajouter un formateur a une classe \"\n         |" +
                "     |\"    2.associer un formateur a une classe \"\n        |" +
                "     |\"    3.modifier un formateur par une classse \"\n     |" +
                "     |\"    4.afficher tous les formateurs\"\n               |" +
                "     |\"    5.supprimer un formateur\"\n                     |" +
                "     |\"    6.retourner a la liste principale                |");

        choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    formateur.ajouterFormateur();
                    break;
                case 2:
                    break;
                case 3:
                    formateur.afficherFormateur();
                    break;
                case 4:
                    formateur.modiferFormateur();
                    break;
                case 5:

                    formateur.supprimerFormateur();
                    break;
                case 6:
                    System.out.println("\" voila la liste principale \" \n");
                    break;


            }
        }
    }
}