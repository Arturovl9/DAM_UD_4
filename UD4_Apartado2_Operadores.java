public class UD4_Apartado2_Operadores {
    public static void main(String[] args) {
        // Ejercicio 1 Suma de dos números
            int a = 5;
            int b = 3;
            int suma = a + b;

            System.out.println("Suma: " + suma); // Suma: 8
        
        // Ejercicio 2 Uso de constantes
            final double PI = 3.1416;
            double radio = 4;
            double area = PI * radio * radio;

            System.out.println("Área: " + area); // Área: 50.2656
        
        // Ejercicio 3 División Entera y Resto
            int x = 17;
            int y = 4;

            System.out.println("Cociente: " + (x / y)); // Cociente: 4
            System.out.println("Resto: " + (x % y)); // Resto: 1
            
        // Ejercicio 4 Operadores de asignación compuesta
            int n = 10;
            n += 5; // 15
            n -= 3; // 12
            n *= 2; // 24
            n /= 4; // 6

            System.out.println("Valor final: " + n); // Valor final: 6
            
        // Ejercicio 5 Comparación lógica simple
            int edad = 20;
            boolean mayorEdad = edad >= 18;

            System.out.println("¿Mayor de edad? " + mayorEdad); // true

        // Ejercicio 6 Operadores lógicos con condiciones
            boolean tieneCarnet = true;
            boolean haPagadoTasas = false;
            boolean puedeExaminarse = tieneCarnet && haPagadoTasas;

            System.out.println("¿Puede examinarse? " + puedeExaminarse); // false
        
        // Ejercicio 7 Operador lógico OR
            boolean tieneClave = false;
            boolean recordarContraseña = true;
            boolean puedeAcceder = tieneClave || recordarContraseña;

            System.out.println("¿Puede acceder? " + puedeAcceder); // true
            
        // Ejercicio 8 Uso de operador NOT
            boolean activo = false;

            System.out.println("¿No está activo? " + !activo); // true
            
        // Ejercicio 9 Prioridad de operadores
            int resultado = 10 + 2 * 5; // Multiplicación antes que suma
    
            System.out.println("Resultado: " + resultado); // 20
            
        // Ejercicio 10 Expresión lógica compuesta
            int nota = 7;
            int asistencia = 80;
            boolean aprueba = nota >= 5 && asistencia >= 75;

            System.out.println("¿Aprueba? " + aprueba); // true
            
        // Ejercicio 11 Intercambio de valores entre variables
            int c = 8;
            int d = 3;

            System.out.println("Antes: a = " + c + ", b = " + d);

            int temp = c;
            c = d;
            d = temp;

            System.out.println("Después: a = " + c + ", b = " + d);

        // Ejercicio 12 Expresión lógica completa
            int edad1 = 17;
            boolean tienePermisoPadres = true;
            boolean puedeAsistir = edad1 >= 18 || tienePermisoPadres;

            System.out.println("¿Puede asistir? " + puedeAsistir); // true

        // Ejercicio 13 Ecaluar operación mixta paso a paso
            int resultado1 = (4 + 3) * 2 - 5 % 2;

            // Paso a paso:
            // (4 + 3) = 7
            // 7 * 2 = 14
            // 5 % 2 = 1
            // 14 - 1 = 13

            System.out.println("Resultado1: " + resultado1); // 13

        // Ejercicio 14 Aumento de salario con operador compuesto
            double salario = 1200;
            salario += salario * 0.075;

            System.out.println("Nuevo salario: " + salario); // 1290.0

        // Ejercicio 15Evaluar si un número es par y múltiplo de 5
            int numero = 30;

            boolean esPar = numero % 2 == 0;
            boolean esMultiploDe5 = numero % 5 == 0;
            boolean cumpleCondicion = esPar && esMultiploDe5;

            System.out.println("¿Es par y múltiplo de 5? " + cumpleCondicion); // true

        // Ejercicio 16 Suma, multiplicación y división
            // Primero: 2 * 5 = 10
            // Luego: 10 / 2 = 5
            // Finalmente: 10 + 5 = 15
            int resultado2 = 10 + 2 * 5 / 2;

            System.out.println("Resultado2: " + resultado2); // 15

        // Ejercicio 17 Uso de paréntesis para cambiar precedencia
            // Sin paréntesis: 2 * 5 = 10; luego 8 + 10 = 18
            int e = 8 + 2 * 5;

            // Con paréntesis: 8 + 2 = 10; luego 10 * 5 = 50
            int f = (8 + 2) * 5;

            System.out.println("e = " + e); // 18
            System.out.println("f = " + f); // 50

        // Ejercicio 18 Mezcla de aritméticos y lógicos
            // Sin paréntesis: 2 * 5 = 10; luego 8 + 10 = 18
            int g = 8 + 2 * 5;

            // Con paréntesis: 8 + 2 = 10; luego 10 * 5 = 50
            int h = (8 + 2) * 5;

            System.out.println("g = " + g); // 18
            System.out.println("h = " + h); // 50

        // Ejercicio 19
            // 3 + 2 > 4 → 5 > 4 → true
            // !(true) → false
            // 5 * 2 < 8 → 10 < 8 → false
            // false || false → false

            boolean res = !(3 + 2 > 4) || 5 * 2 < 8;
            System.out.println("Resultado: " + res); // false

        // Ejercicio 20
            // Dentro de paréntesis: 8 / 4 = 2 → 2 + 1 = 3
            // Multiplicación: 3 * 2 = 6
            // Finalmente: 5 + 6 - 3 = 8
            int resultado3 = 5 + 3 * 2 - (8 / 4 + 1);

            System.out.println("Resultado: " + resultado3); // 8
        
    }
}
