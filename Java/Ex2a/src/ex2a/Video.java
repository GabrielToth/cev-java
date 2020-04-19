package ex2a;
public class Video {
    String titulo;
    String autor;
    String editor;
    String pedicao;
    String pgravacao;
    String esta;
    int duracao;
    int demora;
    float preco;
    boolean ar;
    
    void assistir() {
        if (this.ar == false) {
            System.out.println("O vídeo está offline, imbecíl!");
        } else {
            System.out.println("MÃAAEE, cadê minha pipoca?");
        }
            
    }
    
    void status() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Editor: " + this.editor);
        System.out.println("Programa de edição: " + this.pedicao);
        System.out.println("Programa de gravação: " + this.pgravacao);
        System.out.println("Duração: " + this.duracao + " m");
        System.out.println("Período de espera: " + this.demora + " h");
        System.out.println("Preço final: R$ " + this.preco);
        System.out.println("Estado atual do vídeo: " + this.esta);
    }
    
    void online() {
        ar = true;
        esta = "Está online";
    }
    void offline() {
        ar = false;
        esta = "Está offline";
    }
    
}
