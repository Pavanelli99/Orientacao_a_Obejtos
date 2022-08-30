package interfaces;


public class TesteInterface {
    
    public static void main(String []args) {
        double a = 10, b = 20;
        Triangulo reto = new Triangulo();
        System.out.println("\nÁrea do triangulo = " + reto.areaTriangulo(a, b));
        System.out.println("\nRaiz do triangulo = " + reto.raiz(a, b)+ "\n");
    
    
    }

  
    
}
