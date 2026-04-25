import java.util.Scanner;

public class UD4_EjemploExamen {

    public static void main(String[] args) {
        // Ejercicio 1
            Scanner entrada = new Scanner(System.in);
            
            System.out.print("Introduce los kilometros de distancia que hay: ");
            double dist = entrada.nextDouble();
            
            System.out.print("Introduce la velocidad media a la que se va a ir: ");
            double v = entrada.nextDouble();
            
            System.out.print("Introduce la velocidad máxima para ir por la via: ");
            double tMax = entrada.nextDouble();
            
            double t = dist/v;
            double tMin = t * 60;
            
            int h = (int) t;
            int m = (int) (tMin - h*60);
            
            boolean esViajeCorto = t < 2.0;
            boolean superaTiempoMaximo = t > tMax;
            boolean velocidadIlegal = v > 120;
            
            System.out.println("Tiempo Total: " + t);
            System.out.println("Tiempo en Minutos: " + m);
            System.out.println("¿El viaje es corto? " + esViajeCorto);
            System.out.println("¿Supera el tiempo máximo? " + superaTiempoMaximo);
            System.out.println("¿Conduce a una velocidad ilegal?" + velocidadIlegal);
        
        // Ejercicio 2
        
        // Ejercicio 3
        
        // Ejercicio 4
        
        // Ejercicio 5
        
        // Ejercicio 6
        
    }
    
}
