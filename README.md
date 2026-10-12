# 🏦 Simulación de Exportación de Datos Financieros (Clases Abstractas y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema de exportación de registros económicos hacia diferentes entidades de control (Banco Central y Agencia Tributaria). Pone en práctica conceptos avanzados de la **Programación Orientada a Objetos (POO)** como **clases abstractas**, **herencia**, **métodos concretos compartidos** y **polimorfismo** mediante colecciones en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una superclase abstracta que centraliza la lógica común y múltiples implementaciones específicas:

*   **`ExportadorFinanciero` (Clase Abstracta)**: Define la estructura base y el comportamiento compartido para cualquier canal de exportación.
    *   **Método concreto (`validarRegistros`)**: Evalúa de forma centralizada que la lista de registros no sea nula ni se encuentre vacía (`!registros.isEmpty()`), evitando la duplicación de validaciones en las subclases.
    *   **Método abstracto (`exportarDatos`)**: Obliga a cada subclase a implementar su propia lógica de transferencia.
*   **`ExportadorBancoCentral`**: Modela el canal de exportación hacia la entidad bancaria central.
    *   **Comportamiento:** Valida los registros y recorre la lista imprimiendo las transferencias de balances económicos por consola.
*   **`ExportadorAgenciaTributaria`**: Modela el canal de exportación hacia el ente fiscal o tributario.
    *   **Comportamiento:** Aplica el mismo mecanismo de validación pero adapta el mensaje descriptivo al envío de declaraciones fiscales.
*   **`Main`**: Punto de entrada del programa. Inicializa una lista con balances financieros de ejemplo, instancia ambos tipos de exportadores de forma polimórfica y ejecuta pruebas tanto con datos válidos como con una lista vacía para comprobar el manejo de errores.

---

## ⚙️ Conceptos Clave de POO Aplicados

1. **Reutilización de Código en Clases Abstractas:** A diferencia de una interfaz, la clase abstracta `ExportadorFinanciero` implementa directamente un método funcional (`validarRegistros`) que es heredado y utilizado por todas las subclases de manera transparente.
2. **Polimorfismo:** Permite declarar variables del tipo abstracto (`ExportadorFinanciero banco = new ExportadorBancoCentral();`) para invocar el método de exportación adaptado en tiempo de ejecución.
3. **Validación Defensiva:** Antes de procesar cualquier bucle de envío, el sistema corrobora la integridad de los datos de entrada, interrumpiendo la ejecución y emitiendo un mensaje de error si la lista está vacía.
4. **Principio Abierto/Cerrado (OCP):** Facilita la incorporación de nuevos destinos de exportación (ej. `ExportadorAuditoriaInterna`) creando una nueva clase que extienda de `ExportadorFinanciero` sin alterar la lógica de validación existente.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
=== BANCO CENTRAL ===
Iniciando exportacion al Banco Central...
Transfiriendo: Balance enero: $150000
Transfiriendo: Balance febrero: $230000
Transfiriendo: Balance marzo: $180000
Exportacion al Banco Central completada.

=== AGENCIA TRIBUTARIA ===
Iniciando exportacion a la Agencia Tributaria...
Enviando declaracion: Balance enero: $150000
Enviando declaracion: Balance febrero: $230000
Enviando declaracion: Balance marzo: $180000
Exportacion a la Agencia Tributaria completada.

=== PRUEBA DE VALIDACION ===
Error: no hay registros para exportar.
