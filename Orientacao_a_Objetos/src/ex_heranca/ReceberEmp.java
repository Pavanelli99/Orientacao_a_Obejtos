package ex_heranca;

import java.time.LocalDate;
import java.util.Scanner;

public class ReceberEmp extends Pessoa{
    private Estudante estudante;
    private Funcionario funcionario;
    private Livro livro;
    private LocalDate dtDevolucao;

    public ReceberEmp(String livro) {
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

    public LocalDate getDtDevolucao() {
        return this.dtDevolucao;
    }

    public void setDtDevolucao(LocalDate dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }

    @Override
    public String toString(){
        return ("Estudante:\t" + this.estudante + "\nFuncionario:\t" + this.funcionario
         + "\nLivro:\t" + this.livro + "\nData Devolução:\t" + this.dtDevolucao);
    }

    public static ReceberEmp cadastrarReceberEmp(){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o nome do livro : ");
        String livro = in.next();
        if (livro.length() < 2){
            System.out.println("O livro não pode ser vazio!");
            in.close();
            return null;
        }
        ReceberEmp novoReceberEmp = new ReceberEmp(livro);
        System.out.print("Digite o nome do Estudante: ");
        novoReceberEmp.setNome(in.next());

        System.out.print("Digite o nome do Funcionario: ");
        novoReceberEmp.setNome(in.next());

        //Dt recebimento
        System.out.print("Digite a data de devolução (dd/mm/yy): ");
        String data = in.next();

        String dtRecebimento[] = data.split("/");

        if (dtRecebimento.length != 3){
            System.out.println("Digite a data corretamente");
            in.close();
            return null;
        }

        for(String d:dtRecebimento) System.out.println(d);

        int dd = Integer.parseInt(dtRecebimento[0]);
        int m = Integer.parseInt(dtRecebimento[1]);
        int y = Integer.parseInt(dtRecebimento[2]);

        LocalDate d = LocalDate.of(y, m, dd);

        in.close();
        return novoReceberEmp;

    }


    
}

    
