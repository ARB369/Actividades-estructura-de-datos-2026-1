public class pilaArreglo {

    private int[] pila; // guardo datos
    private int tope; // posicion del ultimo dato agregado
    private int capacidad; // tamaño maximo 

    public pilaArreglo(int capacidad) { // innicializo la pila con la capacidad dada
        this.capacidad = capacidad;
        pila = new int[capacidad];
        tope = -1; // para indicar que la pila esta vacia 
    }

    public void apilar(int dato) { // mi metodo para aggregar datos a la pila
        if (tope < capacidad - 1) {
            tope++;
            pila[tope] = dato;
        } else {
            System.out.println("La pila esta llena");
        }
    }

    public void desapilar() { // metodo paraa eliminar el ulitmo dato agregado 
        if (tope >= 0) {
            System.out.println("Dato eliminado: " + pila[tope]);
            tope--;
        } else {
            System.out.println("La pila esta vacia");
        }
    }

    public int tamanhoActual() { // para ontener el tamaño actual de la pila
        return tope + 1;
    }

    public int espacioDisponible() { // con este metodo puedo saber cuanto espacio me queda en la pila para agregar mas datos
        return capacidad - tamanhoActual();
    }

    public void mostrarEspacio() { // muestro si la pila esta llena o cuanto espacio me queda para agregar mas datos
        if (espacioDisponible() == 0) {
            System.out.println("La pila esta llena");
        } else {
            System.out.println("Se pueden agregar " + espacioDisponible() + " datos mas");
        }
    }

}
