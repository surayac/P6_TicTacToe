# P6_TicTacToe
![Java](https://img.shields.io/badge/Java-21-blue) ![Maven](https://img.shields.io/badge/Maven-3.9.11-orange) ![JUnit](https://img.shields.io/badge/JUnit-5-green)

## 1)  Descripción del Proyecto
Tres en Raya (Tic Tac Toe) en consola implementado con **Java 21**.
Dos jugadores (X y O) se alternan turnos en un tablero 3x3. 
    Gana quien alinee tres símbolos en fila, columna o diagonal.
    Si se llena el tablero sin ganador → empate.
    El juego imprime el tablero por turno y muestra el resultado final.
    Incluye colores ANSI en la terminal (si tu terminal los soporta).

<img width="300" height="180" alt="Captura de pantalla 2025-09-30 152950" src="https://github.com/user-attachments/assets/b136e3b4-c43c-4cf0-81a0-685bd49c9b37" />
<img width="300" height="180" alt="Captura de pantalla 2025-09-30 152906" src="https://github.com/user-attachments/assets/21593b0e-548d-4768-95cd-bddfb6ccf4c6" />

## 2) Clonar el proyecto
git clone https://github.com/usuario/P6_TicTacToe.git

cd P6_TicTacToe

## 3) Instrucciones de juego
1. Inicia la app en consola.
2. Introduce **fila** y **columna** separadas por un espacio, por ejemplo: '1 1'.
3. Rango válido: '0-2' para fila y '0-2' para columna.
4. Si la casilla está ocupada o fuera de rango, el juego te pedirá otra entrada.
5. X y O se alternan hasta que haya **victoria** (tres en línea, columna o diagonal) o **empate** (tablero lleno).
6. El tablero se muestra con **colores ANSI** (si tu terminal los soporta).

## 4) Tecnologías y herramientas
| Tecnología / Herramienta | Versión |
|---|---|
| Java JDK | **21.0.8+12-LTS-250** |
| Maven (CLI) | **Ejecuta con `mvn -v`** |
| `maven-clean-plugin` | **3.1.0** |
| `JUnit Testing Framework` | **5.10.0** |
| `maven-Surefire-plugin` | **3.2.5** |

## 5) Requisitos
- Java 21 instalado y disponible en tu PATH.
- Maven instalado.

## 6) Cómo compilar
Compilar y empaquetar el proyecto:

mvn -q clean package

## 7) Ejecutar
java -cp target/classes com.tictactoe.App

> Nota (VS Code): el botón **Run** ejecuta algo equivalente a  
> `java -cp target/classes com.tictactoe.App`  
> Si ves errores por clases no compiladas, corre primero: `mvn clean package`.

## 8) Testing
Ejecuta los tests con JUnit:

mvn test

## 9) Estructura del Proyecto
```bash
P6_TicTacToe
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   └── java/com/tictactoe
│   │       ├── App.java
│   │       ├── Game.java
│   │       ├── Board.java
│   │       └── Player.java
│   └── test/java/com/tictactoe
│       └── AppTest.java
│       └── BoardTest.java   
└── target/...
```

## 10) Team
- [Suraya Mattar](https://github.com/surayac) → Product Owner & Dev  
- [Sofia Toro](https://github.com/sofiatoroviafara01) → Scrum Master & Dev  
- [Erika Montoya](https://github.com/DevErika) → Developer

---


