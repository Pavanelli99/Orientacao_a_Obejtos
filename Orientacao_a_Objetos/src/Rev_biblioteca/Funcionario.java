package Rev_biblioteca;

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


    
}
