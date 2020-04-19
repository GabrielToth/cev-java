package aula09;
public interface Publicacao {
    public Livro abrir();
    public Livro fechar();
    public Livro folhear(int p);
    public Livro avancarPag();
    public Livro voltarPag();
    
}
