// Clase principal donde se prueba el árbol
public class MainBST {
    public static void main(String[] args) {

        BST arbol = new BST();

        // datos del punto 2
        int[] datos = {150, 44, 180, 20, 11, 15, 147, 8};

        // Se insertan uno por uno respetando las reglas del BST y de la clase
        for (int dato : datos) {
            arbol.raiz = arbol.insertar(arbol.raiz, dato);
        }

        System.out.println("Preorden:");
        arbol.preorden(arbol.raiz);

        System.out.println("\nInorden:");
        arbol.inorden(arbol.raiz);

        System.out.println("\nPostorden:");
        arbol.postorden(arbol.raiz);
    }
}