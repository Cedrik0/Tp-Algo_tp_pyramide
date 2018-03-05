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
    public static void pyramide(int n){
            /**
             * regarde si i est inferieur a n, et rajoute 1 a i
             * cote droit
             */
            for (int i=0;i<n;i++) {
                /**
                 * regarde si j est inférieur a n moins n et rajoute 1 a j
                 * cote gauche
                 */
                for(int j=0;j<n-i;j++){
                /**
                 * Genere les espaces sur le cote
                 */
                System.out.print(" ");
            }   
                /**
                 * regarde si k est inferieur ou egale a i et rajoute 1 a k
                 */
            for(int k=0;k<=i;k++){
                /**
                 * genere la pyramide
                 */
                System.out.print(" *");
            }
            System.out.println();
        }
    }
        
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("entrer la hauteur:");
        
        if(scanner.hasNextInt()){
            int hauteur =scanner.nextInt();
            System.out.println("la hauteur entrée est " + hauteur);
            
            pyramide(hauteur);
            
        }
    }
}