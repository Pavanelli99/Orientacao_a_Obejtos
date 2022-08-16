package ex_heranca;

import java.time.LocalDate;

public class Livro {

    private String titulo;
    private String editora;
    private LocalDate dtLancamento;

    //só pode criar livro se passar o titulo
    public Livro (String _titulo){
        this.titulo = _titulo;
    }


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public LocalDate getDtLancamento() {
        return this.dtLancamento;
    }

    public void setDtLancamento(LocalDate dtLancamento) {
        this.dtLancamento = dtLancamento;
    }

    
}
