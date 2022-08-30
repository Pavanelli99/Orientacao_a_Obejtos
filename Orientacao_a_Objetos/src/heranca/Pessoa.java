package heranca;

public abstract class Pessoa {

    protected String nome;
    protected String endereco;
    protected int passos;

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void andar(){
        this.passos++;
        System.out.println("Andando ...");
    }
    public void falar(){
        System.out.println("Falando ....");
    }
    
}
