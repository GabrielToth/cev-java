/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

import java.util.Scanner;

/**
 *
 * @author Gabriel Toth
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**Scanner teclado = new Scanner(System.in);
        System.out.println("Nota 1: ");
        float n1 = teclado.nextFloat();
        System.out.println("Nota 2: ");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Média: " + m);
        if (m > 9) {
            System.out.println("Parabéns");
        }*/
        System.out.println("Idade: ");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ano de nascimento:");
        int ano = teclado.nextInt();
        int i = 2019 - ano;
        System.out.println("Idade: " + i);
        if (i>=18){
            if (i>=70){
                System.out.println("Voto opcional");     
            } else {
            System.out.println("Voto obrigatorio");
            }
        } else {
            if (i >=16 && i<18) {
                System.out.println("Voto opcional");
                
            } else {
                System.out.println("Não vota");
            }
            
            
        }
                
    }
    
}
