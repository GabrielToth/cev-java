/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pernas;

import java.util.Scanner;

/**
 *
 * @author Gabriel Toth
 */
public class Pernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Quantidade de pernas:");
        Scanner teclado = new Scanner(System.in);
        int pernas = teclado.nextInt();
        String tipo;
        switch (pernas) {
            case 1:
                 tipo = "Saci";
                 break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Negão do zap";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Artrópode";
                break;
            default:
                tipo = "Et";                
        }
        System.out.println(tipo);
    }
    
}
