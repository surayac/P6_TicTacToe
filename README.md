# P6_TicTacToe

## 1)  Descripción del Proyecto
Tres en Raya en consola implementado con **Java 21**. Dos jugadores (X y O) se alternan turnos en un tablero 3x3. X comienza. Gana quien alinee tres símbolos en fila, columna o diagonal. Si se llena el tablero sin ganador, hay empate. El juego imprime el tablero por turno y muestra el resultado final.

## 2) Instrucciones de juego
1. Inicia la app en consola.
2. Introduce **fila** y **columna** separadas por un espacio, por ejemplo: '1 1'.
3. Rango válido: '0..2' para fila y '0..2' para columna.
4. Si la casilla está ocupada o fuera de rango, el juego te pedirá otra entrada.
5. X y O se alternan hasta que haya **victoria** (tres en línea) o **empate** (tablero lleno).
6. El tablero se muestra con **colores ANSI** (si tu terminal los soporta).

## 3) Tecnologías y herramientas
| Tecnología / Herramienta | Versión |
|---|---|
| Java JDK | **21.0.8+12-LTS-250** |
| Java Runtime | **21.0.8+12-LTS-250** |
| JVM (HotSpot 64-Bit) | **21.0.8+12-LTS-250** |
| Maven (CLI) | **Ejecuta con `mvn -v`** |
| `maven-clean-plugin` | **3.1.0** |
| `JUnit Testing Framework` | **5.10.0** |
| `maven-Surefire-plugin` | **3.2.5** |

> Actualiza la celda de Maven con el valor que devuelva tu `mvn -v`.

## 4) Requisitos
- Java 21 instalado y disponible en tu PATH.
- Maven instalado.

## 5) Cómo compilar
Compilar y empaquetar el proyecto:

mvn -q clean package

## 6) Ejecutar

java -cp target/classes com.tictactoe.App

> Nota (VS Code): el botón **Run** ejecuta algo equivalente a  
> `java -cp target/classes com.tictactoe.App`  
> Si ves errores por clases no compiladas, corre primero: `mvn clean package`.


## 5) Estructura del Proyecto
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
└── target/...
```


## 6) Team
- [Suraya Mattar](https://github.com/surayac) → Product Owner & Dev  
- [Sofia Toro](https://github.com/sofiatoroviafara01) → Scrum Master & Dev  
- [Erika Montoya](https://github.com/DevErika) → Developer

---

