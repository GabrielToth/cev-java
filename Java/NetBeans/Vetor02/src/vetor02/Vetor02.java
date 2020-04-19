/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Calendar;

/**
 *
 * @author Gabriel Toth
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int tot[] = {31,28,31,30,31,31,30,31,30,31,30,31};
        int year = Calendar.MONTH;
        for (int a = 0; a < mes.length; a++) {
            if (year % 4 == 0){
                tot[1] = 29;
            }
            System.out.println("O mês de " + mes[a] + " têm " + tot[a] + " dias.");
            
        }
    }
    
}
