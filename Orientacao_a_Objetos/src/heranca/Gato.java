package heranca;

public class Gato extends AnimalTerrestre{

    public Gato(){
        super();
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato "+ this.nome + "diz Miaau");
   

        
    }
    
}
