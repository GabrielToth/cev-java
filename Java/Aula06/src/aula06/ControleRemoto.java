package aula06;
public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Metodos
    public ControleRemoto() {
        volume = 50;
        ligado = false;
        tocando = false;
    }
        
    
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    
    //Sobrescrevendo Métodos

    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("Ligando");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("Desligando");
    }

    @Override
    public void abrirMenu() {
        System.out.println("Ligado: " + this.getLigado());
        System.out.println("Tocando: " + this.getTocando());
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("| ");
        }
        System.out.println("Volume: " + this.getVolume());
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() == false || this.getVolume() > 100) {
            System.out.println("O volume não pode ser alterado!");
        } else {
            this.setVolume(this.getVolume() + 1);
            System.out.println("Volume:" + this.getVolume());
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() == false || this.getVolume() == 0) {
           System.out.println("O volume não pode ser alterado!"); 
        } else {
           this.setVolume(this.getVolume() - 1);
           System.out.println("Volume: " + this.getVolume());
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() == false|| this.getVolume() == 0) {
            System.out.println("Impossível de mutar");
        } else {
            this.setVolume(0);
            System.out.println("Mutado");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() ==false || this.getVolume() > 0) {
            System.out.println("Impossível desmutar");
        } else {
            this.setVolume(50);
            System.out.println("Desmutado");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() == false || this.getTocando() == true) {
            System.out.println("Impossível de tocar");
        } else {
            this.setTocando(true);
            System.out.println("Tocando");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() == false || this.getTocando() == false) {
            System.out.println("Impossível pausar");
        } else {
            this.setTocando(false);
            System.out.println("Pausando");
        }
    }
    
}
