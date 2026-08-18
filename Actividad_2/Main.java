import java.util.Random;
import java.util.Stack; //Librerias Random y Stack para la actividad 

public class Main {

    public static void main(String[] args) {

        Random random = new Random(); // importo la clase Random para generar numeros aleatorios

        pilaArreglo pila = new pilaArreglo(9); // 1er punto: instancia de la clase pilaArreglo con una capacidad de 9 elementos

        for (int i = 0; i < 5; i++) { // 2do punto: agregro 5 numeros aleatorios a la pila y los muestro en consola
            int num = random.nextInt(100);
            System.out.println("Numero agregado: " + num);
            pila.apilar(num);
        }

        System.out.println("Tamaño actual: " + pila.tamanhoActual()); // 3er punto: muestro el tamaño actual de la pila despues de agregar los 5 numeros

        pila.desapilar(); // 4to punto: elimino el ultimo numero agregado a la pila y muestro el numero eliminado en consola

        System.out.println("Tamaño actual despues de borrar: " + pila.tamanhoActual());

        pila.mostrarEspacio(); // 5to punto: muestro si la pila esta llena o cuanto espacio me queda para agregar mas numeros

        // uso la clase stack paraa punto final 
        Stack<Integer> pila1 = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();

        for (int i = 0; i < 7; i++) {
            pila1.push(random.nextInt(100)); // Agrego 7 numeros aleatorios a la pila1 usando el metodo push de la clase Stack
        }

        while (!pila1.isEmpty()) {
            pila2.push(pila1.pop()); // el metodo pop de la clase Stack elimina el ultimo elemento agregado a pila1 y lo agrega a pila2, esto hace que los numeros se inviertan en pila2
        }

        System.out.println("Pila invertida:");
        for (Integer num : pila2) {
            System.out.println(num); // Muestro los numeros de pila2 en consola que ahora estan en orden inverso al que fueron agregados a pila1
        }
    }

}
