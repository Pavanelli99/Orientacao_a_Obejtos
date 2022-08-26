package ex_heranca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaHeranca {

    private final static String[] opcoes = {

            "|¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨|",
            "|************* Sistema Biblioteca v1 *********************|",
            "|                                                         |",
            "|--------------- Escolha uma Opção -----------------------|",
            "|1 - Cadastar Livro                                       |",
            "|2 - Cadastar Funcionario                                 |",
            "|3 - Cadastar Estudante                                   |",
            "|4 - Cadastar Autor                                       |",
            "|5 - Cadastar Emprestimo                                  |",
            "|6 - Receber Emprestimo                                   |",
            "|0 - Sair                                                 |",
            "|_________________________________________________________|",

    };

    private static List<Livro> livros = new ArrayList<Livro>();
    private static List<Estudante> estudantes = new ArrayList<Estudante>();
    private static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private static List<Autor> autores = new ArrayList<Autor>();
    private static List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    private static Scanner buffer = new Scanner(System.in);

    public static void main( String[] args) throws IOException{
        int op = 1;
        while(op != 0){
        
            printMenu();
            System.out.println("\n\n ");
            op = buffer.nextInt();
            escolha(op);
            System.in.read();
            
        }
    }
     
    //----------------------------------------------------------------------
    public static void printMenu(){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        for (String op: opcoes){
            System.out.println(op);
        }
    }
    //-----------------------------------------------------------------------
    private static void escolha (int op){
        switch(op){
            //Cadastrar o livro;
            case 1:
            Livro novoLivro = Livro.cadastrarLivro();
            System.out.println("\nLivro Cadastrado");
            System.out.println(novoLivro.toString());
            livros.add(novoLivro);
           // break;

            //Funcionario
            case 2:
            Funcionario novoFunc = Funcionario.cadastrarFunc();
            System.out.println("\nFuncionario Cadastrado");
            System.out.println(novoFunc.toString());
            funcionarios.add(novoFunc);
           // break;

            //Estudante
            case 3:
            Estudante novoEstudante = Estudante.cadastrarEstudante();
            System.out.println("\nEstudante Cadastrado");
            System.out.println(novoEstudante.toString());
            estudantes.add(novoEstudante);
            //break;

            //Autor
            case 4:
            Autor novoAutor = Autor.cadastrarAutor();
            System.out.println("\nAutor Cadastrado");
            System.out.println(novoAutor.toString());
            autores.add(novoAutor);
            //break;

            //Emprestimo
            case 5:
            Emprestimo novoEmprestimo = Emprestimo.cadastrarEmprestimo();
            System.out.println("\nEmprestimo Cadastrado");
            System.out.println(novoEmprestimo.toString());
            emprestimos.add(novoEmprestimo);
           break;

            //Receber Emprestimo
           // case 6:
           // Estudante novoEstudante = Estudante.cadastrarEstudante();
           // System.out.println("\nEstudante Cadastrado");
          //  System.out.println(novoEstudante.toString());
           // estudantes.add(novoEstudante);
           // break;

            default :
            System.out.println("Saindo da função escolha");

        }
    }

}
