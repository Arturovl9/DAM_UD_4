import java.util.Scanner;
        
public class UD4_Ejemplo_Entrada_Salida {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ejemplo 1
            String nombre;

            System.out.println("Introduce tu nombre: ");

            nombre = entrada.nextLine();
            System.out.println("Hola " + nombre);
            
        // Ejercicio 2
            double radio, area, circunferencia;
            
            System.out.print("Introduce el radio: ");
            radio = entrada.nextDouble();
            
            area = Math.PI * Math.pow(radio, 2);
            circunferencia = 2 * Math.PI * radio;
            
            System.out.println("El area es " + area);
            System.out.println("La circuferencia es " + circunferencia);
    }
}
