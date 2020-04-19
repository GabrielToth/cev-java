package ex2a;
public class Teclado {
    String idioma;
    String modelo;
    int part;
    int teclas;
    boolean ligado;
    String liga;
    
    void digitar() {
        if (this.ligado == false) {
            System.out.println("Liga a poha do teclado, animal!");
        } else {
            System.out.println("Digitando fwisowinciownco");
        }
    }
    void particoes() {
        if (this.part == 1) {
            System.out.println("Teclado simplificado");
        } else if (this.part == 2) {
            System.out.println("Teclado padrão");
        } else if (this.part == 3) {
            System.out.println("Teclado extendido (Numpad adicionado)");
        } else if (this.part == 4) {
            System.out.println("Teclado completo (Numpad + Botões de atalhos adicionais)");
        } else {
            System.out.println("Esse valor é inexistente em quesitos de particionamento dos setores do teclado.");
        }
        System.out.println("");
    }
    
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Idioma: " + this.idioma);
        System.out.println("Partições: " + this.part);
        System.out.println("Teclas: " + this.teclas);
        System.out.println("Ligado: " + this.liga);
        System.out.println("");
    }
    
    void ligar() {
        this.ligado = true;
        this.liga = "Ligado";
    }
    
    void desligar() {
        this.ligado = false;
        this.liga = "Desligado";
    }
}
