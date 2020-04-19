package aula5a;
public class Aula5a {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setNumConta(2);
        c1.setDono("Jubileu");
        c1.Construtor();
        c1.abrirConta("cc");
        c1.depositar(900);
        c1.sacar(300);
        c1.estaConta();
        
        Conta c5 = new Conta();
        c5.setDono("Creusa");
        c5.Construtor();
        c5.setNumConta(1);
        c5.abrirConta("cp");
        c1.depositar(500);
        c1.estaConta();
    }
    
}
