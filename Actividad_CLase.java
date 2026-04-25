import java.util.Scanner;

public class Actividad_CLase {
    public static void main(String[] args) {
        // Ejercicio 1
            Scanner entrada = new Scanner(System.in);
            System.out.print("Introduce el primer numero: ");
            double num1 = entrada.nextDouble();
            
            System.out.print("Introduce el segundo numero: ");
            double num2 = entrada.nextDouble();
            
            double suma = num1 + num2;
            System.out.println("La suma de los números " + num1 + " y " + num2 + " es " + suma);
            
        // Ejercicio 2
            System.out.print("Introduce el primer numero: ");
            double num3 = entrada.nextDouble();
            
            System.out.print("Introduce el segundo numero: ");
            double num4 = entrada.nextDouble();
            
            double suma1 = num3 + num4;
            double restar = num3 - num4;
            double multiplicacion = num3 * num4;
            double division = num3 / num4;
            
            System.out.println("La suma de los numeros " + num3 + " y " + num4 + " es " + suma1);
            System.out.println("La resta de los numeros " + num3 + " y " + num4 + " es " + restar);
            System.out.println("La multiplicacion de los numeros " + num3 + " y " + num4 + " es " + multiplicacion);
            System.out.println("La division de los numeros " + num3 + " y " + num4 + " es " + division);
        // Ejercicio 3
            System.out.print ("Introduce un número entero: ");
            int num = entrada.nextInt();
            
            boolean esPar = (num % 2 == 0);
            System.out.print("¿El numero " + num + " es par? " + esPar);

        //Ejercicio 4
            double IVA = 21.0;
            
            System.out.print ("Introduce el precio del producto: ");
            double precio = entrada.nextDouble();
            
            double resulIVA = precio * (IVA/100);
            double precioFinal = precio + resulIVA;
            
            System.out.print("El precio del producto sin IVA es " + precio);
            System.out.print("El IVA del producto es " + resulIVA);
            System.out.print("El precio final del producto es " + precioFinal);
        
        // Ejercicio 7
            System.out.print("Introduce el primer numero: ");
            int num5 = entrada.nextInt();
            
            System.out.print("Introduce el segundo numero: ");
            int num6 = entrada.nextInt();
            
            boolean igual = (num5 == num6);

            System.out.print("¿Son iguales los " + num5 + " y " + num6 + "? " + igual);
        // Ejercicio 8 
            System.out.print("Introduce el primer numero: ");
            int num7 = entrada.nextInt();
            
            System.out.print("Introduce el segundo numero: ");
            int num8 = entrada.nextInt();   
            
            boolean esPositivo = (num7 >= 0 && num8 >= 0);
            System.out.print("¿Ambos sonpositivos? " + esPositivo);
            

    }
}
