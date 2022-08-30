package ex_heranca;

import java.time.LocalDate;
import java.util.Scanner;

public class Autor extends Pessoa{

    private String formacao;
    private int qtdLivros; // nunca armazenar isso;


    public Autor (String _formacao){
        this.formacao = _formacao;
    }

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

    public static Autor cadastrarAutor(){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o nome do Autor:");
        String formacao = in.next();
        if (formacao.length() < 2){
            System.out.println("O nome não pode ser vazio!");
            in.close();
            return null;
        }
        Autor novoAutor = new Autor(formacao);
        System.out.print("Digite a formação do Autor:");
        novoAutor.setFormacao(in.next());    

        in.close();
        return novoAutor;

    }



    
}
