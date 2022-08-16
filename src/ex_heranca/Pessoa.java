package ex_heranca;

import java.time.LocalDate;

public abstract class Pessoa {

    protected String nome;
    protected LocalDate dataNasc;
    protected String endereco;

    // Esse construtor só existe para poder gerar instacia em estudante e funcionario
    public Pessoa(){

    }

    // Esse construtor só existe para poder gerar instacia de autor
    public Pessoa(String _nome, LocalDate _dataNasc, String _endereco){
        this.nome = _nome; // _ significa privado
        this.endereco = _endereco;
        this.dataNasc = _dataNasc;



    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNasc() {
        return this.dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



    
    
}
