# Actividad 3 — Árboles y Árboles Binarios de Búsqueda

## Descripción

Actividad práctica desarrollada en **Java** para trabajar con estructuras de datos basadas en árboles.

La actividad contiene dos ejercicios principales. El primero consiste en construir manualmente un árbol binario y realizar diferentes recorridos sobre sus nodos. El segundo consiste en implementar un **Árbol Binario de Búsqueda (BST)** utilizando inserción recursiva.

## Ejercicio 1 — Recorridos de un árbol binario

En este ejercicio se construye un árbol mediante objetos de la clase `Nodo`.

Cada nodo contiene:

* Un valor.
* Una referencia al nodo izquierdo.
* Una referencia al nodo derecho.

El árbol se construye manualmente estableciendo las relaciones entre los diferentes nodos.

Posteriormente se realizan tres recorridos:

### Preorden

Visita los nodos en el siguiente orden:

```text
Raíz → Izquierda → Derecha
```

### Inorden

Visita los nodos en el siguiente orden:

```text
Izquierda → Raíz → Derecha
```

### Postorden

Visita los nodos en el siguiente orden:

```text
Izquierda → Derecha → Raíz
```

Los recorridos se implementan mediante **recursividad**.

### Archivos utilizados

* `Nodo.java` — Representa cada nodo del árbol.
* `Arbol.java` — Contiene los métodos de recorrido.
* `Main.java` — Construye el árbol y ejecuta los recorridos.

---

## Ejercicio 2 — Árbol Binario de Búsqueda (BST)

En el segundo ejercicio se implementa un **Binary Search Tree (BST)**.

Los valores se insertan siguiendo las reglas del árbol binario de búsqueda:

```text
Valor menor → subárbol izquierdo
Valor mayor o igual → subárbol derecho
```

La inserción se realiza de manera **recursiva**, buscando la posición correspondiente para cada nuevo valor.

Los datos utilizados para construir el BST son:

```text
150, 44, 180, 20, 11, 15, 147, 8
```

Una vez construido el árbol, se ejecutan los tres recorridos:

* Preorden.
* Inorden.
* Postorden.

Una característica importante del recorrido **inorden** en un BST es que permite obtener los valores organizados de menor a mayor.

### Archivos utilizados

* `Nodo.java` — Representa los nodos del árbol.
* `BST.java` — Contiene la lógica de inserción y los recorridos.
* `MainBST.java` — Contiene los datos utilizados y ejecuta el BST.

---

## Conceptos trabajados

* Árboles binarios.
* Árboles Binarios de Búsqueda (BST).
* Nodos.
* Referencias entre objetos.
* Recursividad.
* Preorden.
* Inorden.
* Postorden.
* Inserción en árboles.
* Subárboles.
* Estructuras jerárquicas.

## Ejecución

Se requiere tener instalado el **JDK de Java**.

Para ejecutar el primer ejercicio, ubicándose dentro de esta carpeta:

```bash
javac Nodo.java Arbol.java Main.java
java Main
```

Para ejecutar el segundo ejercicio:

```bash
javac Nodo.java BST.java MainBST.java
java MainBST
```

## Aprendizaje

Esta actividad permitió comprender cómo se representan y recorren los árboles mediante nodos y referencias, además de practicar la recursividad aplicada a estructuras de datos.

También permitió implementar un Árbol Binario de Búsqueda y comprender cómo sus reglas de inserción permiten organizar los datos dentro de una estructura jerárquica.

## Tecnologías

* Java
* Programación orientada a objetos
* Recursividad
* Estructuras de datos
