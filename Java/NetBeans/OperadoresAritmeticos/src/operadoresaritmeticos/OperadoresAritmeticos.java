/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author Gabriel Toth
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("Média: " + m);
        int num = 5;
        num ++;
        System.out.println(num);
        int valor = 5 + ++num;
        System.out.println(valor);
        valor = 9 + --num;
        System.out.println(valor);
        int x = 4;
        x += 3;
        System.out.println(x);
        int y = 2;
        y *=4;
        System.out.println(y);
        float z = 5.903f;
        int ar = (int) Math.round(z);
        System.out.println(ar);
        int fl = (int) Math.floor(z);
        System.out.println(fl);
        int ce = (int) Math.ceil(z);
        System.out.println(ce);
        double ran = Math.random();
        System.out.println(ran);
        int randi = (int) (ran * (10-0));
        System.out.println(randi);
                
    }
    
}
