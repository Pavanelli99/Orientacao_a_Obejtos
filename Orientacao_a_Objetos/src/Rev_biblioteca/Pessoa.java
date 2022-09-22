package Rev_biblioteca;

import java.time.LocalDate;

public abstract class Pessoa {

    protected String nome; // Atributo de classe
    protected LocalDate dtNascimento; // Atributo de classe


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtNascimento() {
        return this.dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }



    
}
