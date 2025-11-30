# Sistema de Registro de Usuarios (Ejercicio TDD & Mockito)

Este proyecto implementa un servicio de registro de usuarios simulado, desarrollado bajo la metodología **TDD (Test Driven Development)**.

El objetivo principal es demostrar el desacoplamiento de componentes y el uso de **Dobles de Prueba (Mocks)** para simular dependencias externas que aún no están implementadas.

## 🎯 Objetivos del Ejercicio

1. **Aplicar TDD:** Escribir las pruebas antes que el código funcional (Ciclo *Red-Green-Refactor*).
2. **Simular Dependencias:** Utilizar **Mockito** para aislar el `ServicioDeRegistro` de la dependencia externa `Notificador`.
3. **Inyección de Dependencias:** Diseñar componentes que reciben sus colaboradores en lugar de instanciarlos internamente, facilitando la testabilidad.

## 🏗️ Arquitectura y Diseño

El sistema sigue un diseño de bajo acoplamiento mediante el principio de inversión de dependencias.

### Componentes del Sistema:

- **`ServicioDeRegistro` (Clase)**: 
  Es el componente central. Contiene la lógica de negocio y coordina el proceso. Depende de la interfaz `Notificador`, no de una implementación concreta.
  
- **`Notificador` (Interface)**: 
  Define el contrato abstracto para el envío de notificaciones (método `enviar`). Al ser una interfaz, permite crear *Mocks* fácilmente durante las pruebas para simular el envío de correos sin necesidad de un servidor real.
  
- **`Usuario` (Clase)**: 
  Objeto de dominio simple (POJO) que transporta la información del usuario (nombre, datos) a través del sistema.

## 🛠️ Stack Tecnológico

- **Java 17**: Lenguaje de programación.
- **Maven**: Gestión de dependencias y automatización de la construcción.
- **JUnit 5**: Framework estándar para pruebas unitarias en Java.
- **Mockito**: Framework para la creación de objetos simulados (mocks) y verificación de comportamientos (verify).

## 🧪 Ejecución de Pruebas

El proyecto cuenta con una cobertura de pruebas centrada en el comportamiento (`Behavior verification`).

### Opción 1: Desde la terminal (Maven)
Ejecuta el siguiente comando en la raíz del proyecto para correr todas las pruebas:
```bash
mvn test
Opción 2: Desde IntelliJ IDEA
Navega a la carpeta src/test/java.

Haz clic derecho sobre SuiteRegistro (o ServicioDeRegistroTest).

Selecciona "Run 'SuiteRegistro'".

¿Qué se está probando?
La prueba principal (ServicioDeRegistroTest) valida el siguiente escenario:

"Cuando se registra un usuario, el sistema debe invocar al método enviar del notificador exactamente una vez con el mensaje de bienvenida correcto."

📂 Estructura del Proyecto
Plaintext

SistemaRegistro
├── src
│   ├── main
│   │   └── java/com/bootcamp/registro
│   │       ├── Notificador.java        (Contrato)
│   │       ├── ServicioDeRegistro.java (Lógica)
│   │       └── Usuario.java            (Modelo)
│   │
│   └── test
│       └── java/com/bootcamp/registro
│           ├── ServicioDeRegistroTest.java (Test con Mocks)
│           └── SuiteRegistro.java          (Agrupador de tests)
│
├── pom.xml                (Dependencias: JUnit 5, Mockito)
└── .gitignore             (Exclusiones de git)
✒️ Autores
[Luis Alfredo Fiedler Fiedler] - Desarrollador Trainee - Bootcamp Fullstack Java

Proyecto realizado con fines educativos para el Módulo 4: Fundamentos de Java.