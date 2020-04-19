package aula5a;
public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estaConta() {
        System.out.println("Número da Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Estado: " + this.getStatus());
    }
    public void Construtor() {
        this.saldo = 0;
        this.status = false;
    }
    
    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int num) {
        this.numConta = num;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void setStatus(boolean s) {
        this.status = s;
    }
    public boolean getStatus() {
        return this.status;
    }
    

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t == "cc") {
            this.saldo = 50;
        } else if (t == "cp") {
            this.setSaldo(150);
        }
        
    }
    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("A conta possui dinheiro.");
        } else if (this.saldo < 0) {
            System.out.println("A conta está devendo.");
        } else {
            this.setStatus(false);
        }
    } 
    
    public void depositar(float v) {
        if (this.getStatus() == true) {
            this.setSaldo(getSaldo() + v);
        } else {
            System.out.println("Conta não encontrada!");
        }
            
    }
    public void sacar(float v) {
        if (this.getStatus() == true) {
            if (this.getSaldo() > 0) {
                this.setSaldo(this.getSaldo() - v);
            } else {
                System.out.println("Conta está em dividendo!" + this.getSaldo());
            }
        } else {
            System.out.println("Conta inexistente");
        }
    }
    public void pagarMensal() {
        float v = 0; 
        if (this.getTipo() == "cc") {
            v = 12;    
        } else if (this.getTipo() == "cp") {
            v = 20;
        }
        if (this.getStatus() == true) {
            if (this.getSaldo() > v) {
            this.setSaldo(this.getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Conta inexistente.");
        }            
    }
    
}
