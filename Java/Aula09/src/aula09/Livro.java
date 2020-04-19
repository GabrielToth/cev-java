package aula09;
public class Livro implements Publicacao {
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = 0;
        this.pagAtual = pagAtual;
        this.leitor = leitor;
        this.aberto = false;
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    public void detalhes() {
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Páginas: " + this.getTotPaginas());
        System.out.println("Aberto? " + this.isAberto());
        System.out.println("Leitor: " + this.getLeitor());
    }

    @Override
    public void abrir() {
    }

    @Override
    public void fechar() {
    }

    @Override
    public void folhear(int p) {
    }

    @Override
    public void avancarPag() {
    }

    @Override
    public void voltarPag() {
    }
}
