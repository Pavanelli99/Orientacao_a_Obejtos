package ex_heranca;

import java.time.LocalDate;
import java.util.Scanner;

public class Estudante extends Pessoa{

    private String ra;
    private String curso;
    private LocalDate dtInicio;

    public Estudante (String _ra){
        this.ra = _ra;
    }
    

    public String getRa() {
        return this.ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public LocalDate getDtInicio() {
        return this.dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    @Override
    public String toString(){
        return ("RA:\t" + this.ra + "\nCurso:\t" + this.curso + "\nData Inicio:\t" + this.dtInicio);
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
