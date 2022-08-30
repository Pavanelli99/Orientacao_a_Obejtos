package collections;

import java.util.ArrayList;
import java.util.List;
import ex_heranca.Livro;

public class MinhaColecao {

    public static void main(String[] args) {

       //int vetor[] = new int [5];

        // dessa forma eu declaro uma collection;
        List<Livro> livros = new ArrayList<Livro>();

       // Livro livros[] = new Livros();
        Livro l1 = new Livro("Minha Coleção");
        Livro l2 = new Livro("Minha Coleção pt 2");
        Livro l3 = new Livro("Minha Coleção pt 3");
        Livro l4 = new Livro("Minha Coleção pt 4");

        livros.add(l1);
        livros.add(l2);
        livros.add(l3);
        livros.add(l4);

        //imprimir a lista
        for(int i = 0; i < livros.size(); i++){
            System.out.println(livros.get(i));

        }

        livros.remove(0);

        //opção avançada para imprimir lista
        //for(Livro l : livros){
        //    System.out.println(l);
        // }

    
        
        
    }
    
}
