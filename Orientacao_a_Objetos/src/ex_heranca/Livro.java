package ex_heranca;

import java.time.LocalDate;
import java.util.Scanner;

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

    @Override
    public String toString(){
        return ("Titulo:\t" + this.titulo + "\nEditora:\t" + this.editora + "\nData Lanc:\t" + this.dtLancamento);
        //DateTimeFormater
    }

    public static Livro cadastrarLivro(){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o titulo do Livro: ");
        String titulo = in.next();
        if (titulo.length() < 2){
            System.out.println("O titulo não pode ser vazio! digite pelo menos 2 caracteres ");
            in.close();
            return null;
        }
        Livro novoLivro = new Livro(titulo);
        System.out.print("Digite a editora do livro: ");
        novoLivro.setEditora(in.next());

        System.out.print("Digite a data de lancamento (dd/mm/yy): ");
        String data = in.next();
        String dtLanc[] = data.split("/");

        if (dtLanc.length != 3){
            System.out.println("Digite a data corretamente");
            in.close();
            return null;
        }

        for(String d:dtLanc) System.out.println(d);

        int dd = Integer.parseInt(dtLanc[0]);
        int m = Integer.parseInt(dtLanc[1]);
        int y = Integer.parseInt(dtLanc[2]);

        LocalDate d = LocalDate.of(y, m, dd);

        in.close();
        return novoLivro;

    }

    
}
