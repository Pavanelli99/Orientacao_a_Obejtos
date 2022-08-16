package ex_heranca;

import java.time.LocalDate;
import java.time.Month;

public class TesteExHeranca {

    public static void main(String []args){
 
        //Objeto Autor 
        LocalDate dataNasc = LocalDate.of(1988, Month.APRIL, 10);
        Autor Eduardo = new Autor("Eduardo", dataNasc , "Rua 2", "Superior",2);

        //Objeto livroPOO
        Livro livroPOO = new Livro("Programando em orientacao a objetos");
        livroPOO.setEditora("Editora Erica");
        LocalDate dataLancamentoPOO = LocalDate.of(1999, Month.DECEMBER, 22);
        livroPOO.setDtLancamento(dataLancamentoPOO);
        //Objeto livroLP
        Livro livroLP = new Livro("Programando em java");
        livroLP.setEditora("Editora Mozo"); 
        LocalDate dataLancamentoLP = LocalDate.of(1987, Month.OCTOBER, 12);
        livroLP.setDtLancamento( dataLancamentoLP);


        //Objeto Funcionario
        Funcionario func = new Funcionario();
        func.setNome("Eduardo");
        func.setEndereco("Rua seila");
        LocalDate dataNascEd = LocalDate.of(1999, Month.DECEMBER, 22);
        func.setDataNasc(dataNascEd);
        LocalDate dataAdm = LocalDate.of(2022, Month.JULY, 01);
        func.setDtAdimissao(dataAdm);
        func.setCargo("TI");
        func.setMatricula("1203040404");

        //Objeto Estudante
        Estudante est = new Estudante();
        est.setNome("Eduardo");
        est.setEndereco("Rua seila");
        LocalDate dataNascEst= LocalDate.of(1999, Month.DECEMBER, 22);
        est.setDataNasc(dataNascEst);
        est.setCurso("Tads");
        est.setRa("120304330404");
        LocalDate dataInit = LocalDate.of(2020, Month.JANUARY, 10);
        est.setDtInicio(dataInit);
       


        
    }
    
}
