package aula09;
public class Pessoa {
    private String nome, sexo;
    private int idade;
    

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
        if (this.sexo == "M") {
            this.sexo = "Masculino";
        } else {
            this.sexo = "Feminino";
        }
    }
    
    public void fazerAniver() {
        System.out.println("Parabéns, seu aniversário é hoje");
        this.idade++;
    }

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    
    
    
}
