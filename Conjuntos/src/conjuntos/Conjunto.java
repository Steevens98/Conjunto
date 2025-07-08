package conjuntos;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Conjunto<T> {
    private ArrayList<T> elementos;
    
    public Conjunto() {
        elementos = new ArrayList<>();
    }

    public boolean agregar(T elem) {
        if (!elementos.contains(elem)) {
            elementos.add(elem);
            return true;
        }
        return false;
    }

    public boolean contiene(T elem) {
        return elementos.contains(elem);
    }
    
    public void imprimir() {
        System.out.print("{ ");
        for (T elem : elementos) {
            System.out.print(elem + " ");
        }
        System.out.println("}");
    }
    
    public static <T> Conjunto union(Conjunto<T> a, Conjunto<T> b) {
        Conjunto resultado = new Conjunto();
        for (T elem : a.elementos) {
            resultado.agregar(elem);
        }
        for (T elem : b.elementos) {
            resultado.agregar(elem); // Solo agrega si no está
        }
        return resultado;
    }
    

    public static <T> Conjunto interseccion(Conjunto<T> a, Conjunto<T> b) {
        Conjunto resultado = new Conjunto();
        for (T elem : a.elementos) {
            if (b.contiene(elem)) {
                resultado.agregar(elem);
            }
        }
        return resultado;
    }
 

    public static <T> Conjunto diferencia(Conjunto<T> a, Conjunto<T> b) {
        Conjunto resultado = new Conjunto();
        for (T elem : a.elementos) {
            if (!b.contiene(elem)) {
                resultado.agregar(elem);
            }
        }
        return resultado;
    }
    
    
    public static <T> Conjunto<T> diferenciaAsimetrica(Conjunto<T> a, Conjunto<T> b) {
        Conjunto<T> unionAB = union(a, b);
        Conjunto<T> interseccionAB = interseccion(a, b);
        return diferencia(unionAB, interseccionAB);
    }
    
    
}
