class Nodo { // esta clase la uso para representar cada nodo del arbol
    String valor; // el valor que se voy a almacenar en el nodo
    Nodo izquierdo, derecho;

    public Nodo(String valor) {
        this.valor = valor;
        izquierdo = derecho = null; // basicamente inicio los nodos con hijos o conexiones null y se deja listo para conectarlo al arbol
    }
}