/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Gabriel Toth
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nome:");
        String nome = teclado.nextLine();
        System.out.println("Nota: ");
        float nota = teclado.nextFloat();
        System.out.println("Nota: " + nota);
        System.out.printf("%s Nota: R$%.2f \n", nome, nota);
    }
    
}
