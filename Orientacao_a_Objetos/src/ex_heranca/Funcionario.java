package ex_heranca;

import java.time.LocalDate;
import java.util.Scanner;

public class Funcionario extends Pessoa {

    private String matricula;
    private LocalDate dtAdimissao;
    private String cargo;

    //só pode criar funcionario se passar o matricula
    public Funcionario (String _matricula){
        this.matricula = _matricula;
    }


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
        return ("Matricula:\t" + this.matricula + "\nCargo:" + this.cargo + "\nData Admissão:\t" + this.dtAdimissao );
    }
   

    public static Funcionario cadastrarFunc(){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o numero da Matricula: ");
        String matricula = in.next();
        if (matricula.length() < 2){
            System.out.println("A matricula não pode ser vazia! digite pelo menos 2 numeros ");
            in.close();
            return null;
        }
        Funcionario novoFunc = new Funcionario(matricula);
        System.out.print("Digite o cargo: ");
        novoFunc.setCargo(in.next());

        System.out.print("Digite a data de admissão (dd/mm/yy): ");
        String data = in.next();
        String dtAdm[] = data.split("/");

        if (dtAdm.length != 3){
            System.out.println("Digite a data corretamente");
            in.close();
            return null;
        }

        for(String d:dtAdm) System.out.println(d);

        int dd = Integer.parseInt(dtAdm[0]);
        int m = Integer.parseInt(dtAdm[1]);
        int y = Integer.parseInt(dtAdm[2]);

        LocalDate d = LocalDate.of(y, m, dd);

        in.close();
        return novoFunc;

    }

}
