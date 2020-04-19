/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01a02;
import java.util.*;
/**
 *
 * @author Gabriel Toth
 */
public class Ex01A02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale loc = Locale.getDefault();
        System.out.println("Idioma: " + loc.getDisplayLanguage() + " - " + loc.getLanguage());
        
        System.getProperties();
        System.out.println(System.getProperty("user.language"));
    }
    
}
