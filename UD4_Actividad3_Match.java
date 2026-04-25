public class UD4_Actividad3_Match {
    public static void main(String[] args) {
            //Ejercicio 1
            int numA = (int)(Math.random() * 100) + 1;
            int numB = (int)(Math.random() * 100) + 1;

            // Uso de Math.max y Math.min
            int maximo = Math.max(numA, numB);
            int minimo = Math.min(numA, numB);
            
            System.out.println("Número A: " + numA);
            System.out.println("Número B: " + numB);
            System.out.println("El menor es: " + minimo);
            System.out.println("El mayor es: " + maximo);
        
        // Ejercicio 2
            double base = 5.0;
            int exponente = 3;

            double resultadoPotencia = Math.pow(base, exponente); 
            System.out.println(base + " elevado a " + exponente + " es: " + resultadoPotencia);

        // Ejercicio 3
            double n = 7.56;

            // round (a 8)
            long redondeo = Math.round(n);
            // ceil (a 8.0)
            double techo = Math.ceil(n);
            // floor (a 7.0)
            double suelo = Math.floor(n);

            System.out.println("Valor Original: " + n);
            System.out.println("Math.round (entero más cercano): " + redondeo); 
            System.out.println("Math.ceil (hacia arriba): " + techo);
            System.out.println("Math.floor (hacia abajo): " + suelo);
        // Ejercicio 4
            // Numerador: Math.sqrt(81) + Math.pow(5, 2)
            double numerador = Math.sqrt(81) + Math.pow(5, 2);

            // Denominador: Math.abs(-12)
            double denominador = Math.abs(-12);

            // Resultado final
            double resultado = numerador / denominador;
            System.out.println(resultado);

        
        // Ejercicio 5
            double grados = 60.0; // Ejemplo: 60 grados

            // Conversión a radianes
            double radianes = Math.toRadians(grados);

            // Aplicación de las funciones trigonométricas
            System.out.println("Angulo (" + grados + "º) en radianes: " + radianes);
            System.out.println("Seno: " + Math.sin(radianes));
            System.out.println("Coseno: " + Math.cos(radianes));
            System.out.println("Tangente: " + Math.tan(radianes));
            
        // Ejercicio 6
            // Puntos (Ejemplo)
            int x1 = 5, y1 = 7;
            int x2 = 8, y2 = 12;

            // 1. Calcular las diferencias de coordenadas (catetos)
            double diffX = x2 - x1; // 8 - 5 = 3
            double diffY = y2 - y1; // 12 - 7 = 5

            // 2. Calcular el cuadrado de las diferencias (catetos al cuadrado)
            double cuadradoX = Math.pow(diffX, 2); // 3^2 = 9.0
            double cuadradoY = Math.pow(diffY, 2); // 4^2 = 16.0

            // 3. Sumar los cuadrados (Hipotenusa al cuadrado)
            double sumaCuadrados = cuadradoX + cuadradoY; // 9.0 + 16.0 = 25.0

            // 4. Aplicar la raíz cuadrada
            double distancia = Math.sqrt(sumaCuadrados); // sqrt(25.0) = 5.0

            System.out.println("Distancia entre (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + "): " + distancia);
    }
}
