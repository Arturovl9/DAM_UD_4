public class UD4_Actividad2_Operadores {
    public static void main(String[] args) {
        //Ejercicio 1
            // 1º Declaramos e inicialización de las notas
            double notaX = 6.5;
            double notaY = 8.0;
            double notaTrabajoFinal = 7.5;
            
            // 2º Declaramos e inicialización de las los porcentajes de los examenes en formato decimal
            double pesoX = 0.40;
            double pesoY = 0.40;
            double pesoTrabajoFinal = 0.20;
            
            // 3º El cálculo de la nota final se utilizara el operador de la multiplicación (*) y suma (+)
            double notaFinal = (notaX * pesoX) + (notaY * pesoY) + (notaTrabajoFinal * pesoTrabajoFinal);
            
            // 4º Mostrar el resultado
            System.out.println("La nota final del alumno es: " + notaFinal);
        
        // Ejercicio 2
            // 1º Declaración e inicialización de las variables
            int totalSegundos = 86399;
            int X = 3600;
            int Y = 60;
            
            // 2º Se calcula las horas
            int horas = totalSegundos / X;
            
            // 3º Obtenemos los segundos sobrantes
            int Z = totalSegundos % X;
            
            // 4º Se calcula los minutos a partir de los seguntos sobrantes
            int minutos = Z / Y;
            
            // 5º Se calcula los segundos finales
            int segundos = Z % Y;
            
            // 6º Mostrar el resultado
            System.out.println("Horas: " + horas + ", Minutos: " + minutos + ", Segundos: " + segundos);
            
        // Ejercicio 3
            double precioSinIva = 19.99;
            double tipoIva = 21.0; //en porcentaje
            
            // 1º Convertir el procentaje en una forma decimal para poder calcularlo el IVA en euros
            double formaIVA = tipoIva / 100;
            
            // 2º Se calcula el iva que se le va añadir
            double IVA = precioSinIva * formaIVA;
            
            // 3º Se calcula el precio final sumando el IVA más el precio sin IVA
            double precioFinal = precioSinIva + IVA;
            
            // 4º La conversión a int truncará los decimales eliminando el .XX
            int sinDecimal = (int)precioFinal;
            
            // 5º Mostrar el resultado
            System.out.println ("Precio sin IVA: " + precioSinIva);
            System.out.println ("IVA en Euros: " + IVA);
            System.out.println ("Precio Final (Con decimales) : " + precioFinal);
            System.out.println ("Precio Final (solo euros) : " + sinDecimal);
            
        // Ejercicio 4
            int n1 = 7;
            int n2 = 8;
            int n3 = 10;
            
            // Cálculo 1: Media Entera (División de enteros)
            // El resultado es siempre un entero, ya que se descartan los decimales inmediatamente para ajustar el resultado
            int promedio = (n1 + n2 + n3)/3;
            
            // Calculo 2: Media real (División de punto flotante)
            // Al convertir el numerador a double, se fuerza a que toda la operación se resuelva como double.
            double media = (double)(n1 + n2 + n3)/3;
            System.out.println ("La nota promedio de las notas sería: " + promedio);
            System.out.println ("La nota promedio de las notas con decimales sería: " + media);
    }
}
