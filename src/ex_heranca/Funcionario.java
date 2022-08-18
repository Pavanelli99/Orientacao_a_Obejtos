package ex_heranca;

import java.time.LocalDate;

public class Funcionario extends Pessoa {

    private String matricula;
    private LocalDate dtAdimissao;
    private String cargo;


    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDtAdimissao() {
        return this.dtAdimissao;
    }

    public void setDtAdimissao(LocalDate dtAdimissao) {
        this.dtAdimissao = dtAdimissao;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public String toString(){
        return "Matricula: " + this.matricula;
    }



    
}
