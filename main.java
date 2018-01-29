import java.util.Scanner;

/**
 * Created by TreVi1732721 on 2018-01-22.
 */
public class main {
    public static void main(String[] args) {

        Contact[] liste = new Contact[20];
        boolean choix = true, found = false, choix2 = true;
        int selection = 0;

        Scanner sc = new Scanner(System.in);
        while(choix){
            choix = false;
        System.out.println("Que voulez vous faire?\n1- créer un contact\n2- modifier un contact\n3- afficher un contact\n4- quitter");
        selection = sc.nextInt();
        switch(selection){
            case 1:
                int i=-1;

                while(!found && i<=19){
                    i++;
                    if(liste[i]== null){
                        liste[i]= new Contact();
                        found = true;

                    }
                }
                System.out.print("Nouveau contact\n");
                System.out.print("  Quel est le prenom du contact?");
                liste[i].setPrenom(sc.next());
                System.out.print("  Quel est le nom de famille du contact?");
                liste[i].setNom(sc.next());
                System.out.print("Adresse\n");
                System.out.print("  Quel est le numero civic du contact?");
                liste[i].adresse.setNumCivique(sc.nextInt());
                System.out.print("  Quel est le nom de rue du contact?");
                liste[i].adresse.setRue(sc.next());
                System.out.print("  Quel est l'appartement du contact?(Écrire NA si ça ne s'applique pas)");
                liste[i].adresse.setAppartement(sc.next());
                System.out.print("  Quel est la ville du contact?");
                liste[i].adresse.setVille(sc.next());
                System.out.print("  Quel est la province du contact?");
                liste[i].adresse.setProvince(sc.next());
                System.out.print("  Quel est le pays du contact?");
                liste[i].adresse.setPays(sc.next());
                System.out.print("  Quel est l'emplois du contact?");
                liste[i].occupation.setPoste(sc.next());
                System.out.print("L'entreprise\n");
                System.out.print("  Quel est le nom de l'entreprise?");
                liste[i].occupation.entreprise.setNom(sc.next());
                System.out.print("  Quel est le numero civic de l'entreprise");
                liste[i].occupation.entreprise.adresseEntreprise.setNumCivique(sc.nextInt());
                System.out.print("  Quel est le nom de rue de l'entreprise?");
                liste[i].occupation.entreprise.adresseEntreprise.setRue(sc.next());
                System.out.print("  Quel est l'appartement de l'entreprise?(Écrire NA si ça ne s'applique pas)");
                liste[i].occupation.entreprise.adresseEntreprise.setAppartement(sc.next());
                System.out.print("  Quel est la ville de l'entreprise?");
                liste[i].occupation.entreprise.adresseEntreprise.setVille(sc.next());
                System.out.print("  Quel est la province de l'entreprise?");
                liste[i].occupation.entreprise.adresseEntreprise.setProvince(sc.next());
                System.out.print("  Quel est le pays de l'entreprise?");
                liste[i].occupation.entreprise.adresseEntreprise.setPays(sc.next());
                System.out.print("Téléphone\n");
                System.out.print("Voulez vous entrer un numero de telephone?\n1- oui\n2- non");
                selection = sc.nextInt();
                if(selection == 1){
                    choix = true;
                }
                while(choix){
                    int j=0;
                    System.out.println("  Quel est le type de numero de téléphone du contact?(maison, travail, cellulaire, ...)");
                    liste[i].numeroTelephone[j].setInformation(sc.next());
                    System.out.println("  Quel est le numero de téléphone du contact?");
                    liste[i].numeroTelephone[j].setNumero(sc.next());
                    choix2=true;
                    while(choix2){
                        choix2 = false;
                    System.out.println("voulez vous mettre un autre numéro?\n1- oui\n2- non");
                    selection = sc.nextInt();
                    j++;
                    if(selection == 2){
                        choix = false;
                    }else if(selection != 1){
                        System.out.print("votre choix est invalide!");
                        choix2 = true;
                    }
                    }
                }
                choix=true;
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:choix = true;
                break;
        }
        }
        }
    }

