package Rev_biblioteca;

import java.time.format.DateTimeFormatter;

public class Estudante extends Pessoa{
    //  String nome;
    //  LocalDate dtNascimento;
    private String ra; // Atributo de classe
    private String curso; // Atributo de classe


     public Estudante (String _ra, String _nome){
        this.ra = _ra;
        this.nome = _nome;
     }

     public String getRa(){
        return this.ra;
     }

     public void setRa(String _ra){
        this.ra = _ra;
     }

     public String getCurso(){
        return this.curso;
     }

     public void setCurso(String _curso){
        this.curso = _curso;
     }

     public String toString() { 

        DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return ("\nNome: \t\t\t" + this.nome +
               "\nRA: \t\t\t" + this.ra +
               "\nCurso: \t\t\t" + this.curso +
               "\nData nascimento: \t" + this.dtNascimento.format(format)
               );
     }
    
}
