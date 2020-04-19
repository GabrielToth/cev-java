package aula2;
public class Aula2 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        c1.destampar();
        c1.rabiscar();
        c1.status();
    }
    
}
