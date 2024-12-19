import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {

    public static void main(String[] args) {

        int choix = 0;
        Scanner scanner = new Scanner(System.in);

        while (choix !=4){

            System.out.println("1.\" Gestion de Systeme Apprenant \"");
            System.out.println("2.\" Gestion de Systeme Fomrmateur \"");
            System.out.println("3.\" Gestion de Systeme Classe \"");
            System.out.println("4.\" Quitter \"");
            choix = scanner.nextInt();
            switch (choix){
                case 1 : menuApprenant();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
            }


        }


    }

    private static void menuApprenant(){
        int choix = 0;
        Apprenant apprenant = new Apprenant();
        Scanner scanner = new Scanner(System.in);
        while (choix !=4){
            System.out.println("   ***********************************************");
            System.out.println("   *  1.\" Ajouter un Apprenant a une classe \"  *");
            System.out.println("   *  2.\"Associer un Apprenant a une classe \"  *");
            System.out.println("   *  3.\" modifier un Apprenant \"              *");
            System.out.println("   *  4.\" afficher un Apprenant \"              *");
            System.out.println("   *  5.\" supprimer un Apprenant \"              *");

            choix = scanner.nextInt();
            switch (choix){
                case 1 :

                    apprenant.ajouterApprenant();
                    break;
                case 2:apprenant.modiferApprenant();
                    break;
                case 3:
                    apprenant.AfficherApprenant();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }


        }
    }
}