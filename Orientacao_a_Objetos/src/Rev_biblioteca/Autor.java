package Rev_biblioteca;

public class Autor extends Pessoa {
    // String nome;
    // LocalDate daNascimento;
    private int qtoLivros; // Atributo de classe
    private String area; // Atributo de classe

    public Autor (int _qtoLivros, String _nome){ //
       this.qtoLivros = _qtoLivros; //
        this.nome = _nome; //
     }

    public int getQtoLivros() {
        return this.qtoLivros;
    }

    public void setQtoLivros(int _qtoLivros) {
        this.qtoLivros = _qtoLivros;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String _area) {
        this.area = _area;
    }


}

