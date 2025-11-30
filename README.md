# Sistema de Registro de Usuarios (Ejercicio TDD & Mockito)

Este proyecto implementa un servicio de registro de usuarios simulado, desarrollado bajo la metodología **TDD (Test Driven Development)**.

El objetivo principal es demostrar el desacoplamiento de componentes y el uso de **Dobles de Prueba (Mocks)** para simular dependencias externas que aún no están implementadas.

## 🎯 Objetivos del Ejercicio

1. **Aplicar TDD:** Escribir las pruebas antes que el código funcional (Ciclo Red-Green-Refactor).
2. **Simular Dependencias:** Utilizar **Mockito** para aislar el `ServicioDeRegistro` de la dependencia externa `Notificador`.
3. **Inyección de Dependencias:** Diseñar componentes que reciben sus colaboradores en lugar de instanciarlos internamente.

## 🏗️ Arquitectura y Diseño

El sistema sigue un diseño de bajo acoplamiento mediante inversión de dependencias:

```mermaid
classDiagram
    class ServicioDeRegistro {
        +registrar(Usuario usuario)
    }
    class Notificador {
        <<interface>>
        +enviar(String mensaje, Usuario usuario)
    }
    class Usuario {
        -String nombre
    }

    ServicioDeRegistro ..> Notificador : usa (dependencia)
    ServicioDeRegistro ..> Usuario : procesa
<<<<<<< HEAD
=======
```
>>>>>>> d321ebf (docs: agregar documentación del proyecto y exclusiones de git)
ServicioDeRegistro: Contiene la lógica de negocio.

Notificador (Interface): Contrato abstracto para el envío de notificaciones.

Usuario: Modelo de datos simple (POJO).

🛠️ Stack Tecnológico
Java 17: Lenguaje principal.

Maven: Gestión de dependencias.

JUnit 5: Framework de pruebas unitarias.

Mockito: Framework para creación de Mocks y verificación de comportamientos.

🧪 Ejecución de Pruebas
El proyecto cuenta con una Suite de pruebas que verifica tanto la lógica de negocio como la interacción entre componentes.

Comando Maven (Terminal)
Bash

mvn test
Escenario de Prueba Principal (ServicioDeRegistroTest)
La prueba valida que:

Al llamar a registrar(usuario)...

El servicio invoca correctamente al método enviar() del mock de Notificador.

Se verifica que los parámetros pasados al mock sean los esperados.

📂 Estructura del Proyecto
Plaintext

src
├── main
│   └── java/com/bootcamp/registro
│       ├── Notificador.java        (Interfaz)
│       ├── ServicioDeRegistro.java (Lógica)
│       └── Usuario.java            (Modelo)
└── test
    └── java/com/bootcamp/registro
        ├── ServicioDeRegistroTest.java (Test con Mockito)
        └── SuiteRegistro.java          (Suite de ejecución)

✒️ Autor
Luis Alfredo Fiedler Fiedler - Desarrollador en formación


---