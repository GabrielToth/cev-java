package aula09;
public class Aula09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", "M", 5);
        p[1] = new Pessoa("Maria", "F", 7);
        l[0] = new Livro("Sla", "Alguem", 90, p[0]);
        
    }
    
}
