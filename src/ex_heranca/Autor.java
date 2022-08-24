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

    public static Estudante cadastrarEstudante(){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o RA do estudante:");
        String RA = in.next();
        if (RA.length() < 2){
            System.out.println("O numero do RA não pode ser vazio!");
            in.close();
            return null;
        }
        Estudante novoEstudante = new Estudante(RA);
        System.out.print("Digite o nome do Estudante: ");
        novoEstudante.setNome(in.next());

        System.out.print("Digite a data de inicio (dd/mm/yy): ");
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
        return novoEstudante;

    }



    
}
