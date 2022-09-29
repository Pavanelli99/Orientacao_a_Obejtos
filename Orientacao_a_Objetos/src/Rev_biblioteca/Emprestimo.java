package Rev_biblioteca;

import java.time.LocalDate;
import java.util.Scanner;

public class Emprestimo {
    private Livro livro;
    private Funcionario funcionario;
    private Estudante estudante;

    private LocalDate dtEmprestimo; 
    private LocalDate dtDevolucao;

    public Emprestimo(Livro _livro, Funcionario _funcionario, Estudante _estudante) {  
        this.livro = _livro; 
        this.funcionario = _funcionario; 
        this.estudante = _estudante; 
        this.dtEmprestimo = LocalDate.now();
    }  
        

    public Livro getLivro() {
        return this.livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Estudante getEstudante() {
        return this.estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
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

    public static Funcionario lerEmprestimo(){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o nome do Livro: ");
        String nomeLivro = in.nextLine();

        System.out.println("Digite o nome do funcionario: ");
        String nomeFunc = in.nextLine();

        System.out.println("Digite o nome do estudante: ");
        String nomeEstud = in.nextLine();

        System.out.println("Digite a data de emprestimo (dd/mm/yyyy): ");
        String dtEmprestimo = in.nextLine();


        Funcionario objFuncionario = new Funcionario(matricula,nome);

        return objFuncionario;
    }


}
