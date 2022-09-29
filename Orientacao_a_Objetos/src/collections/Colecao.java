package collections;

import java.util.HashSet;
import java.util.Set;

public class Colecao {

    public static void main(String[] args) {

        // lista
        // List<Autor> lista = new ArrayList<Autor>();

        // Autor x = new Autor();

        // lista.add(x);

        // // lista.get(0);
        // for (int i = 1; i < lista.size(); i++) {
        //     System.out.println("Autor: " + lista.get(i).getNome());   


        // }

        // Set tratar exceptions para não repetir
        Set<String> grupo1, grupo2;
        grupo1 = new HashSet<String>();
        grupo2 = new HashSet<String>();

        String s1,s2,s3,s4,s5,s6;
        s1 = "edu";
        s2 = "Farofa";
        s3 = "Vegetal";
        s4 = "teste";
        s5 = "peixe"; 
        s6 = "carne";
        
        grupo1.add(s1);  grupo2.add(s1);
        grupo1.add(s2);  grupo2.add(s2);
        grupo1.add(s3);  grupo2.add(s3);
        grupo1.add(s4);  grupo2.add(s4);
        grupo1.add(s5);  grupo2.add(s5);
        grupo1.add(s1);  grupo2.add(s6);


        System.out.println("\n####  GRUPO 1 ####");
        for(String s : grupo1){
            System.out.print(s + "\t");
        }

        System.out.println("\n####  GRUPO 2 ####");
        for(String s : grupo2){
            System.out.print(s + "\t");
        }

        if(!grupo1.contains("Ana")){
            System.out.println("\nExiste ana dentro da colecao");
        }

                
    }
    
}
