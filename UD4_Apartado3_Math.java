public class UD4_Apartado3_Math {
    /******************************************************************************

    Ejercicio 1 – Calcular raíz cuadrada

    Declara una variable int numero = 16 y muestra su raíz cuadrada usando Math.sqrt().

    Listado de funciones de la clase Math en Java

    Constantes
    Math.PI        // Valor de π (pi) ≈ 3.141592653589793
    Math.E         // Valor de e ≈ 2.718281828459045
    ________________________________________

    Potencias y raíces
    Math.pow(a, b)     // a elevado a la potencia b (a^b)
    Math.sqrt(a)       // Raíz cuadrada de a (√a)
    Math.cbrt(a)       // Raíz cúbica de a (³√a)
    ________________________________________

    Logaritmos y exponenciales
    Math.exp(a)        // e^a (exponencial de a)
    Math.log(a)        // Logaritmo natural de a (base e)
    Math.log10(a)      // Logaritmo en base 10 de a
    ________________________________________

    Redondeo
    Math.round(a)      // Redondea al entero más cercano (devuelve `long` o `int`)
    Math.floor(a)      // Redondea hacia abajo (menor entero)
    Math.ceil(a)       // Redondea hacia arriba (mayor entero)
    Math.rint(a)       // Redondea al entero más cercano (como `round`, pero devuelve `double`)
    ________________________________________

    Valor absoluto y signo
    Math.abs(a)        // Valor absoluto de a
    Math.signum(a)     // Devuelve -1.0 si a < 0, 0.0 si a == 0, 1.0 si a > 0
    ________________________________________

    Funciones trigonométricas (en radianes)
    Math.sin(a)        // Seno de a
    Math.cos(a)        // Coseno de a
    Math.tan(a)        // Tangente de a

    Math.asin(a)       // Arco seno de a (devuelve en radianes)
    Math.acos(a)       // Arco coseno de a
    Math.atan(a)       // Arco tangente de a
    Math.atan2(y, x)   // Arco tangente de y/x (toma en cuenta el cuadrante)
    ________________________________________

    Conversiones de ángulos
    Math.toRadians(a)  // Convierte grados a radianes
    Math.toDegrees(a)  // Convierte radianes a grados
    ________________________________________

    Comparación
    Math.max(a, b)     // Máximo entre a y b
    Math.min(a, b)     // Mínimo entre a y b
    ________________________________________
    Aleatoriedad
    Math.random()      // Devuelve un número decimal aleatorio entre 0.0 y 1.0

    *******************************************************************************/
    public static void main(String[] args) {
        int numero = 16;
        double raiz = Math.sqrt(numero);
        System.out.println("Raíz cuadrada: " + raiz); // 4.0

    }   
}
