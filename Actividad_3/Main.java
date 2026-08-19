public class Main {
    public static void main(String[] args) {

        Arbol arbol = new Arbol();

        // creo los nodos de mi arbol y le doy los valores de la activiada
        Nodo A1 = new Nodo("A1");
        Nodo C5 = new Nodo("C5");
        Nodo D7 = new Nodo("D7");
        Nodo B3 = new Nodo("B3");
        Nodo F9 = new Nodo("F9");
        Nodo D1 = new Nodo("D1");
        Nodo F8 = new Nodo("F8");
        Nodo T3 = new Nodo("T3");
        Nodo A2 = new Nodo("A2");
        Nodo J1 = new Nodo("J1");

        // contruccion 
        arbol.raiz = A1; // nodo raiz

        // nivel 1
        A1.izquierdo = C5;
        A1.derecho = D7;

        // rama izquierda
        C5.izquierdo = B3;
        B3.izquierdo = F8;
        F8.izquierdo = J1;

        // rama derecha
        D7.izquierdo = F9;
        D7.derecho = D1;

        // subarbol de F9
        F9.izquierdo = T3;
        F9.derecho = A2;

        // y ejecuto los recorridos  que hice en mi clase arbol
        System.out.println("Preorden:");
        arbol.preorden(arbol.raiz);

        System.out.println("\nInorden:");
        arbol.inorden(arbol.raiz);

        System.out.println("\nPostorden:");
        arbol.postorden(arbol.raiz);
    }
}