#  Proyecto: Gestión Básica de Productos en Java

##  Descripción

Este proyecto es una demostración básica de Programación Orientada a Objetos (POO) en Java.

Se implementa una clase `Product` que representa un producto con los siguientes atributos:

- `id` → Identificador del producto  
- `name` → Nombre del producto  
- `price` → Precio  
- `stock` → Cantidad disponible en inventario  

La clase incluye:

- Constructores (vacío y con parámetros)
- Métodos getters y setters
- Validaciones básicas (precio y stock no negativos)
- Método `toString()` para mostrar la información completa del objeto

La clase `Main` se encarga de:

- Crear objetos `Product`
- Modificar valores usando setters
- Mostrar información usando getters
- Imprimir los objetos completos

---

## Propósito del Proyecto

Este proyecto tiene como objetivo:

- Practicar conceptos básicos de POO en Java
- Comprender el uso de constructores
- Aplicar encapsulamiento mediante atributos privados
- Utilizar métodos getter y setter
- Entender cómo funcionan los paquetes (`package`)
- Aprender a compilar y ejecutar un proyecto Java correctamente

---

## Estructura del Proyecto

src/main/java/
└── com/example/
├── Main.java
└── Product.java

Ambas clases pertenecen al paquete:

```java
package com.example;
Cómo Compilar y Ejecutar

Abre el proyecto en VS Code.
Asegúrate de tener instalada la extensión "Extension Pack for Java".
Abre el archivo Main.java.
Haz clic en el botón: RUN 

## Salida esperada
Demostracion
metodo set
metodo get producto 1
null
null
metodo get producto 2
40.0
Laptop
objetos completos:
Producto {ID='null', Nombre=null'Precio200.0'Stock0}
Producto {ID='P123', Nombre=Laptop'Precio40.0'Stock12}

