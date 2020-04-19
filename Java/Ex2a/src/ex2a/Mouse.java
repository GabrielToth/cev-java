package ex2a;
public class Mouse {
    String modelo;
    String cor;
    int dpi;
    int botoes;
    boolean ligado;
    
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("DPI: " + this.dpi);
        System.out.println("Botões: " + this.botoes);
        System.out.println("Ligado: " + this.ligado);
        System.out.println("");
    }
    
    void mexer() {
        if (this.ligado == true) {
            System.out.println("Mexendo...");
            System.out.println("");
        } else {
            System.out.println("Está desligado, sua mula.");
            System.out.println("");
        }        
    }
    
    void ligar() {
        this.ligado = true;
    }
    
    void desligar() {
        this.ligado = false;
    }
    
}
