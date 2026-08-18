# Actividad 2 — Implementación de una Pila

## Descripción

Actividad práctica desarrollada en Java para trabajar con la estructura de datos **pila (Stack)**.

En esta actividad se implementa una pila utilizando un arreglo y se desarrollan operaciones básicas como agregar y eliminar elementos, consultar el tamaño y determinar el espacio disponible.

También se utiliza la clase `Stack` de Java para invertir los elementos de una pila.

## Primera parte — Pila implementada con un arreglo

La clase `pilaArreglo` utiliza un arreglo de enteros para almacenar los datos.

La pila tiene una capacidad definida al momento de crearla y utiliza una variable `tope` para identificar la posición del último elemento agregado.

### Operaciones implementadas

* `apilar()` — Agrega un elemento a la pila.
* `desapilar()` — Elimina el último elemento agregado.
* `tamanhoActual()` — Obtiene el número de elementos actuales.
* `espacioDisponible()` — Calcula el espacio restante.
* `mostrarEspacio()` — Muestra el espacio disponible o indica si la pila está llena.

La estructura sigue el principio **LIFO (Last In, First Out)**:

> El último elemento en entrar es el primero en salir.

## Segunda parte — Uso de Stack

También se utiliza `Stack<Integer>` de Java.

Se crean dos pilas:

```text
pila1
pila2
```

Se agregan números aleatorios a `pila1` y posteriormente se utilizan las operaciones `push()` y `pop()` para transferir los elementos a `pila2`, invirtiendo su orden.

## Conceptos utilizados

* Estructuras de datos.
* Pilas.
* Arreglos.
* Principio LIFO.
* Clases y objetos.
* Métodos.
* Encapsulamiento.
* `Random`.
* `Stack`.
* `push()` y `pop()`.

## Ejecución

Se requiere tener instalado el **JDK de Java**.

Desde la terminal, ubicándose dentro de esta carpeta:

```bash
javac Main.java pilaArreglo.java
java Main
```

Los números utilizados en el programa se generan aleatoriamente.

## Aprendizaje

Esta actividad permitió comprender el funcionamiento de una pila y practicar su implementación utilizando un arreglo, además de comparar esta implementación con la estructura `Stack` proporcionada por Java.
