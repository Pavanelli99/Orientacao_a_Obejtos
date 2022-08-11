package heranca;

public class TesteHeranca{

    public static void main(String []args){
        Cao bilu = new Cao();
        bilu.setNome("bilu");
        bilu.setIdade(4);
        bilu.setRaca("maltes");

        Dono edu = new Dono();
        edu.setNome("edu");
        edu.setEndereco("Rua x, 123");
        edu.setAnimal(bilu);

        edu.getAnimal().emitirSom();
        edu.alimentarAnimal(bilu);
        edu.andar();

        Funcionario Eduardo = new Funcionario();
        Eduardo.setMatricula(12345670);
        Eduardo.toString();
        System.out.println(Eduardo.toString());
      
    
    }

}

