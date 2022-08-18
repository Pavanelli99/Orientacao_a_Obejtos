package ex_heranca;

import java.time.LocalDate;

public class Autor extends Pessoa{

    private String formacao;
    private int qtdLivros; // nunca armazenar isso;

    public Autor(String nome, LocalDate dataNasc, String endereco, String formacao, int qtdLivros){

    super(nome, dataNasc, endereco);
    this.formacao = formacao;
    this.qtdLivros = qtdLivros;
    }

    public String getFormacao() {
        return this.formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getQtdLivros() {
        return this.qtdLivros;
    }

    public void setQtdLivros(int qtdLivros) {
        this.qtdLivros = qtdLivros;
    }

    @Override
    public String toString(){
        return "Formação: " + this.formacao;
    }

    
}
