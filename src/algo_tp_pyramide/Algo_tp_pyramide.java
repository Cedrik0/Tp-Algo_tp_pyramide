/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo_tp_pyramide;

import java.util.Scanner;

/**
 *
 * @author cedriclavery
 */
public class Algo_tp_pyramide {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        //déclaration des variables
        char caractere = '*';
        int hauteur, decalage, cars;
        char elements[];
        //l'objet scanner nous permet de lire un flux ( ici ce qui est rentré au clavier dans la console)
        Scanner scanner = new Scanner(System.in);
        // petit texte permettant à l'utilisateur d'interagir avec le système.
        System.out.println("bonjour de quel hauteur voulez vous la pyramide ?");
        while (true) {
            // la hauteur doit etre un entier
            if (scanner.hasNextInt()) {
                //on stocke la hauteur rentrée par l'utilisateur
                //le décalage sera réduit a chaque itération
                decalage = hauteur = scanner.nextInt();

                //Grace a la hauteur on peut ecrire chaque ligne
                for (int i = 0; i < hauteur; i++) {
                    //reduction du decalage
                    decalage--;
                    //nombre de caractère a afficher sur la ligne en cours
                    cars = i * 2 + 1;
                    //chaque ligne est un tableau de caratère
                    elements = new char[decalage + cars];
                    //on met les espaces dans le tableau
                    for (int j = 0; j < decalage; j++) {
                        elements[j] = ' ';
                    }
                    //on met les caractères
                    for (int j = 0; j < cars; j++) {
                        elements[decalage + j] = caractere;
                    }
                    //on affiche la ligne
                    System.out.println(elements);
                }
                //on sort du while 
                break;
            } else {
                System.out.println("la hauteur doit etre un entier");
                //relance l'ecoute de l'entrée
                scanner.next();

            }
        }
    }

}