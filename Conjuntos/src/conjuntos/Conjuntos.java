package conjuntos;

/**
 *
 * @author Usuario
 */
public class Conjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conjunto<String> conjunto1 = new Conjunto<>();
        conjunto1.agregar("Lucas");
        conjunto1.agregar("Moises");
        conjunto1.agregar("Juan");
        conjunto1.agregar("Pedro");

        Conjunto<String> conjunto2 = new Conjunto<>();
        conjunto2.agregar("Ana");
        conjunto2.agregar("Pedro");
        conjunto2.agregar("Moises");
        

        Conjunto<String> union = Conjunto.union(conjunto1, conjunto2);
        Conjunto<String> diferenciaSimetrica = Conjunto.diferenciaSimetrica(conjunto1, conjunto2);
        Conjunto<String> interseccion = Conjunto.interseccion(conjunto1, conjunto2);
        Conjunto<String> diferencia = Conjunto.interseccion(conjunto1, conjunto2);
        
        System.out.print("Conjunto 1: ");
        conjunto1.imprimir();

        System.out.print("Conjunto 2: ");
        conjunto2.imprimir();

        System.out.print("Union: ");
        union.imprimir();
        
        System.out.print("Interseccion: ");
        interseccion.imprimir();
        
        System.out.print("Diferencia A - B: ");
        diferencia.imprimir();
        
        System.out.print("Diferencia simetrica A △ B: ");
        diferenciaSimetrica.imprimir();
        
    
    }
    
}
