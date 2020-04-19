/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author Gabriel Toth
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um número: ");
            n = teclado.nextInt();
            s += n; // s = s + n
            System.out.println("Quer continuar? [S/N]");            
            resp = teclado.next();
        } while (resp.equals("S")||resp.equals("s"));
        System.out.println("Soma: " + s);
    }
    
}
