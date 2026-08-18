// Alejandro Ruiz Benitez - Ingenieria de software y datos I.U Digital -  21-06-2024
// Actividad practica 1  - Estructuras de Datos - 2026-1
// Docente; Leonardo Montes Gutierrez

import java.util.Scanner; //para leer la entrada del teclado

public class DiferenciaArreglos { //creo (aunque es automatico) clase principal mismo nombre que el archivo .java

    public static void main(String[] args) { //metodo principal
        
        Scanner scn = new Scanner(System.in); //invoco el scanner para mi es facil como scn.

        //creo los 3 arreglos con 7 de tamanho
        int arreglo1[] = new int[7];
        int arreglo2[] = new int[7];
        int arreglo3[] = new int[7]; 

        //variables que usare luego 
        int suma = 0;
        double promedio;

        //lleno mi primer arreglo usando for y scanner
        System.out.println("\nIngrese 7 numeros del primer arreglo: ");
        for (int i = 0 ; i < 7; i++){
            System.out.print("Numero " + (i + 1) + ": ");
            arreglo1[i] = scn.nextInt();
        }

        //lleno mi segundo arreglo usando for y scanner (mismo proceso que el primer arreglo)
        System.out.println("\nIngrese 7 numeros del segundo arreglo: ");
        for (int i = 0 ; i < 7; i++){
            System.out.print("Numero " + (i + 1) + ": ");
            arreglo2[i] = scn.nextInt();
        }

        //para llenar el tercer arreglo lo hago con las diferencias entre el primeor y el segundo
        //adiconalmente sumo o acomulo en la variable suma para hace mas comodo el promedio
        for (int i = 0; i < 7; i++){
            arreglo3[i] = arreglo1[i] - arreglo2[i];
            suma += arreglo3[i]; //nota para sustentacion: += es igual a suma = suma + arreglo3[i]
        }

        //hago el promerdio operacion matematica basica suma de valores previamente acomulados en suma dividido el tamanho en este cso 7
        promedio = (double) suma / 7;
        //antes de imprmir el promedio muestro el arreglo 3 para cumplir con la rubrica 
        System.out.println("\nEl contenido del tercer arreglo (diferencias): ");
        for (int i = 0; i < 7; i++){
            System.out.print("posicion " + i + ": " + arreglo3[i] + " ");
        }

        //ahora si el promedio
        System.out.println("\n\nEl promedio de las diferencias en el tercer arreglo es: " + promedio);

        scn.close(); //cierro el scanner para liberar recursos 

    }
}
