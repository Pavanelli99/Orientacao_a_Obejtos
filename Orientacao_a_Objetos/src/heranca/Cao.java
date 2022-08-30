package heranca;

public class Cao  extends AnimalTerrestre{

    public Cao(){
        super();
    }

    @Override
    public void emitirSom() {
        System.out.println("O Cão " + this.nome + " diz AuAu");
       
        
    }
    
}
