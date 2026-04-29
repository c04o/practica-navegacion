# Práctica de Navegación - Jetpack Compose

Este proyecto es una aplicación de Android desarrollada con **Jetpack Compose** que implementa un flujo de navegación completo entre tres pantallas principales. El objetivo es demostrar el uso de `NavHost`, `NavController` y componentes de **Material Design 3**.

## 🚀 Requisitos del Proyecto
* **Tres Pantallas:** Flujo continuo entre Inicio, Detalle y Perfil.
* **Componentes:** Cada pantalla incluye un título identificativo y al menos un componente interactivo (botones).
* **Navegación:** Implementación funcional de `Navigation Compose`.
* **Diseño:** Uso de temas modernos y estructuras de UI declarativas.

## 📱 Pantallas

1.  **Pantalla de Inicio (Inicio):** Punto de entrada de la aplicación con un botón para avanzar al detalle.
2.  **Pantalla de Detalle (Información):** Muestra información relevante y permite navegar hacia el perfil o regresar atrás.
3.  **Pantalla de Perfil (Resumen):** Presenta un resumen final y permite reiniciar el flujo de navegación limpiando la pila de pantallas.

## 🛠️ Tecnologías Utilizadas
* **Lenguaje:** Kotlin
* **Framework:** Jetpack Compose
* **Navegación:** Jetpack Navigation Component (`navigation-compose`)
* **UI:** Material Design 3

## ⚙️ Instrucciones de Ejecución

1.  **Clonar el repositorio:**
    ```bash
    git clone https://github.com/c04o/practica-navegacion.git
    ```
2.  **Abrir en Android Studio:**
    * Abre Android Studio (versión Iguana 2023.3.1 o superior recomendada).
    * Selecciona `File > Open` y busca la carpeta del proyecto.
3.  **Sincronizar Gradle:**
    * Espera a que aparezca el mensaje "Gradle sync finished". Si hay errores de dependencias, haz clic en "Sync Project with Gradle Files".
4.  **Ejecutar:**
    * Conecta un dispositivo físico o inicia un emulador.
    * Presiona el botón **Run** (ícono de play verde) o `Shift + F10`.

## 📝 Historial de Commits (Resumen)
Para este desarrollo se siguió un flujo de trabajo organizado:
1. `Initial commit`: Creación del proyecto base.
2. `docs`: Creación del archivo README.md.
3. `build`: Configuración de dependencias de navegación en Gradle.
4. `feat`: Creación de las pantallas `Inicio`, `Detalle` y `Perfil`.
5. `feat`: Implementación de `NavHost` y configuración final en `MainActivity`.
