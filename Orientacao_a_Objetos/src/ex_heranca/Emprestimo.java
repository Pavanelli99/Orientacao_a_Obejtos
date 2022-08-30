package ex_heranca;

import java.time.LocalDate;
import java.util.Scanner;

public class Emprestimo extends Pessoa {

    private Estudante estudante;
    private Funcionario funcionario;
    private Livro livro;
    private LocalDate dtEmprestimo;
    private LocalDate dtDevolucao;

    public Emprestimo(String livro) {
    }


    public Estudante getEstudante() {
        return this.estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Livro getLivro() {
        return this.livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDtEmprestimo() {
        return this.dtEmprestimo;
    }

    public void setDtEmprestimo(LocalDate dtEmprestimo) {
        this.dtEmprestimo = dtEmprestimo;
    }

    public LocalDate getDtDevolucao() {
        return this.dtDevolucao;
    }

    public void setDtDevolucao(LocalDate dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }

    @Override
    public String toString(){
        return ("Estudante:\t" + this.estudante + "\nFuncionario:\t" + this.funcionario
         + "\nLivro:\t" + this.livro + "\nDt emprestimo:\t" + this.dtEmprestimo
         + "\nDt devolucao:\t" + this.dtDevolucao);
    }

    public static Emprestimo cadastrarEmprestimo(){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o nome do livro: ");
        String livro = in.next();
        if (livro.length() < 2){
            System.out.println("O livro não pode ser vazio!");
            in.close();
            return null;
        }
        Emprestimo novoEmprestimo = new Emprestimo(livro);
        System.out.print("Digite o nome do Estudante: ");
        novoEmprestimo.setNome(in.next());

        System.out.print("Digite o nome do Funcionario: ");
        novoEmprestimo.setNome(in.next());

        //Dt emprestimo
        System.out.print("Digite a data de emprestimo (dd/mm/yy): ");
        String data = in.next();
        System.out.print("Digite a data de devolução (dd/mm/yy): ");
        String data1 = in.next();

        String dtEmp[] = data.split("/");
        String dtDev[] = data1.split("/");

        if (dtEmp.length != 3 && dtDev.length !=3){
            System.out.println("Digite a data corretamente");
            in.close();
            return null;
        }

        for(String d:dtEmp) System.out.println(d);

        int dd = Integer.parseInt(dtEmp[0]);
        int m = Integer.parseInt(dtEmp[1]);
        int y = Integer.parseInt(dtEmp[2]);

        LocalDate d = LocalDate.of(y, m, dd);

        in.close();
        return novoEmprestimo;

    }


    
}
