package heranca;

public class Dono extends Pessoa {
      private int qtoAnimais;

      //construtor
      public Dono(){
        super(); // chama o construtor da suplerclasse
      }
    
      public void alimentarAnimal(Cao animal){
        System.out.println("Estou alimentando o cao chamado" + animal.getNome());

      }
      public void alimentarAnimal(Gato animal){
        System.out.println("Estou alimentando o gato chamado" + animal.getNome());

      }
}
