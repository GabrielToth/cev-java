package ex2a;
public class Ex2a {
    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        m1.cor = "Rosa";
        m1.botoes = 3;
        m1.dpi = 400;
        m1.ligado = true;
        m1.mexer();
        m1.status();
        
        Mouse m2 = new Mouse();
        m2.cor = "Preto";
        m2.botoes = 3;
        m2.dpi = 700;
        m2.ligar();
        m2.mexer();
        m2.status();
        
        Teclado t1 = new Teclado();
        t1.modelo = "Oex n sei oq";
        t1.idioma = "Português - PT";
        t1.part = 3;
        t1.teclas = 140;
        t1.ligado = false;
        t1.ligar();
        t1.digitar();
        t1.particoes();
        t1.status();
        
        Teclado t2 = new Teclado();
        t2.modelo = "Razer bla";
        t2.idioma = "ABNT - US";
        t2.part = 4;
        t2.teclas = 150;
        t2.desligar();
        t2.particoes();
        t2.status();
        
        Video v1 = new Video();
        v1.autor = "Gabriel Toth";
        v1.titulo = "Título de um vídeo qualquer";
        v1.editor = "Gabriel Toth (Editor)";
        v1.pedicao = "Adobe Premiere";
        v1.pgravacao = "NVIDIA Shadow play";
        v1.demora = 120;
        v1.duracao = 15;
        v1.preco = 400.00f;
        v1.ar = true;
        v1.status();
        v1.assistir();
        
        Video v2 = new Video();
        v2.autor = "Gabriel Toth";
        v2.titulo = "Título estranho";
        v2.editor = "Gabriel Toth (Editor)";
        v2.pedicao = "Só em vegas";
        v2.pgravacao = "Action";
        v2.demora = 20;
        v2.duracao = 15;
        v2.preco = 400.00f;
        v2.ar = false;
        v2.online();
        v2.status();
        v2.assistir();
    }
    
}
