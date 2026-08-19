class Arbol {

    Nodo raiz;

    // PREORDEN
    // primero visita el nodo raiz o actual, luego el subarbol izquierdo y finalmente el subarbol derecho
    // En resumen el orden es raiz -> izquierda -> derecha
    void preorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preorden(nodo.izquierdo);
            preorden(nodo.derecho);
        }
    }

    // INORDEN
    // primero visita el subarbol izquierdo, luego el nodo raiz o actual y finalmente el subarbol derecho
    // En resumen el orden es izquierda -> raiz -> derecha
    void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inorden(nodo.derecho);
        }
    }

    // POSTORDEN
    // primero visita el subarbol izquierdo, luego el subarbol derecho y finalmente el nodo raiz o actual
    // En resumen el orden es izquierda -> derecha -> raiz
    void postorden(Nodo nodo) {
        if (nodo != null) {
            postorden(nodo.izquierdo);
            postorden(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }
}