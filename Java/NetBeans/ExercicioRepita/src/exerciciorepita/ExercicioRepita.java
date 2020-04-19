/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Toth
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, a = 0, b = 0, c = 0, d = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um valor <br><em>(Digite '0' para terminar)</em></html>", "Entrada de dados", JOptionPane.WARNING_MESSAGE));
            s += n;
            a++;
            if (n % 2 == 0) {
                b += 1;
            } else {
                c += 1;
            }
            if (n > 100) {
                d += 1;
            }
        } while (n != 0);
        a -= 1;
        JOptionPane.showMessageDialog(null, "<html>Estatísticas finais: <br><hr>" +
                "<br>Soma: " + s + 
                "<br>Valores total: " + a + 
                "<br>Pares: " + b + 
                "<br>Impares: " + c +
                "<br>Acima de 100: " + d +
                "<br>Média: " + (s/a));
    }
    
}
