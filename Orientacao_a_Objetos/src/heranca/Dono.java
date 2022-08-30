package heranca;

public class Dono extends Pessoa {

      private AnimalTerrestre animal;
      private int qtoAnimais = 0;

      //construtor
      public Dono(){
        super(); // chama o construtor da suplerclasse
      }

      public AnimalTerrestre getAnimal() {
        return this.animal;
      }
    
      public void setAnimal(AnimalTerrestre animal) {
        this.animal = animal;
      }

      public int getQtoAnimais() {
          return qtoAnimais;
      }
      public void setQtoAnimais(int qtoAnimais) {
          this.qtoAnimais = qtoAnimais;
      }
     
      public void alimentarAnimal(Cao animal){
        System.out.println("Estou alimentando o cao chamado " + animal.getNome());

      }
      public void alimentarAnimal(Gato animal){
        System.out.println("Estou alimentando o gato chamado " + animal.getNome());

      }
      @Override
      public void andar(){
        this.passos +=2;
        System.out.println(this.nome + " Está correndo ....");
      }
      
}
