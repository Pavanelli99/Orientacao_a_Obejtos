package interfaces;

public class TesteException {
    
    public static void main(String []args) {

        String frase = null;
        String novaFrase = null;
        
        try{
        novaFrase = frase.toUpperCase(); 
        }catch (NullPointerException ex){
            System.out.println("Erro: Frase Nula!\n Usando uma frase default");
            frase = "Estou aprendendo";
            novaFrase = frase.toUpperCase();
        }catch (IllegalArgumentException ex){
            System.out.println("Argumento Invalido");
        }
        //=-----------------------------------------------------
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
        //------------------------------------------------------
        String novaMsg = null;
        String msgCaixaAlta;
        
        try{
            msgCaixaAlta = caixaAlta(novaMsg);        
            }catch (NullPointerException e){
                novaMsg = "Nova Frase ... ";
                msgCaixaAlta = caixaAlta(novaMsg);
                e.printStackTrace();
            }
            System.out.println("Msg Caixa Alta " + msgCaixaAlta);
        //-------------------------------------------------------

    }

    //----------------------------------------------------
    public static String caixaAlta(String msg) throws NullPointerException{
        //pode acontcer um nullPointerExceptions
        String ca = msg.toUpperCase();
        return ca;
    }
}
