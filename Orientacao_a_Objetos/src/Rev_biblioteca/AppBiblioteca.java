package Rev_biblioteca;

import java.time.LocalDate;
import java.util.Scanner;

public class AppBiblioteca {
    
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        Funcionario f = Funcionario.lerFuncionario();
        System.out.println(f.getNome());
        
        // Estudante Obj1 = new Estudante("222001", "Junin"); // "new" aloca um espaço na memoria do processsdor 
        // Obj1.setCurso("Analise e desenvolvimento de sistemas");
        // Obj1.setDtNascimento(LocalDate.of(2000,2,20));

        // System.out.println(Obj1);

        // Autor objAutor = new Autor();
        // objAutor.setNome("Eduardo");
        // objAutor.setArea("PC");


        // Livro objLivro = new Livro();
        // objLivro.setTitulo("Meu PC");
        // objLivro.setAnoLancamento(2011);
        // objLivro.setEditora("fox ");
        // objLivro.setNpag(120);
        // objLivro.setAutor(objAutor);

        // System.out.println(objLivro.getAutor().getNome());

        


    }

}
