// Clase BST: contiene la logica del bst o arbol binario de busqueda
class BST {

    Nodo raiz; // Nodo principal
    // - Si el valor es menor → va a la izquierda
    // - Si es mayor → va a la derecha
    // - Se usa recursividad para encontrar la posición correcta
    Nodo insertar(Nodo nodo, int valor) {
        // Si el nodo esta vacio, creamos uno nuevo
        if (nodo == null) {
            return new Nodo(String.valueOf(valor));
        }

        // convierto el valor del nodo actual a entero para comparar
        int valorNodo = Integer.parseInt(nodo.valor);

        // si el valor a insertar es menor, lo inserta en el subárbol izquierdo
        if (valor < valorNodo) {
            nodo.izquierdo = insertar(nodo.izquierdo, valor);
        } 
        // Si es mayor o igual lo inserta en el subárbol derecho
        else {
            nodo.derecho = insertar(nodo.derecho, valor);
        }

        // retono el nodo actualizado
        return nodo;
    }

    
    // Orden: RAÍZ → IZQUIERDA → DERECHA
    void preorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " "); 
            preorden(nodo.izquierdo);           
            preorden(nodo.derecho);             
        }
    }

    // Orden: IZQUIERDA → RAÍZ → DERECHA
    // devuelve los valores ordenados
    void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izquierdo);            
            System.out.print(nodo.valor + " ");
            inorden(nodo.derecho);              
        }
    }

    // Orden: IZQUIERDA → DERECHA → RAÍZ
    void postorden(Nodo nodo) {
        if (nodo != null) {
            postorden(nodo.izquierdo);         
            postorden(nodo.derecho);            
            System.out.print(nodo.valor + " "); 
        }
    }
}