package Rev_biblioteca;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Funcionario extends Pessoa{
    
    private String matricula; // Atributo de classe 
    private Boolean status; // Atributo de classe

    public Funcionario (String _matricula, String _nome){
        this.matricula = _matricula; 
        this.nome = _nome;
     }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String _matricula) {
        this.matricula = _matricula;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean _status) {
        this.status = _status;
    }

    public String isStatus() {
        //If (this.status) return "Ativo"; else return "Inativo";

        return this.status ? "Ativo" : "Inativo"; // operador ternario 
    }

    public String toString(){   
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");   
        return "Nome: " + this.nome + "\nMatricula: " + this.matricula +
         "\nStatus: " + this.status + "\nData de nascimento: " + this.dtNascimento.format(f);
    }

    public static Funcionario lerFuncionario(){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario: ");
        String nome = in.nextLine();

        System.out.println("Digite a matricula do funcionario: ");
        String matricula = in.nextLine();

        Funcionario objFuncionario = new Funcionario(matricula,nome);

        return objFuncionario;
    }





    

}
