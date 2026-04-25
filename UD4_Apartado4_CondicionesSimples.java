import java.util.Scanner;


public class UD4_Apartado4_CondicionesSimples {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // ------------ Ejercicio 01 ------------
            System.out.println("Introduce un numero: ");
            int n=sc.nextInt();
        
            if (n>0) {
                System.out.println("El numero " + n + " es positivo");
            } else {
                System.out.println("El numero " + n + " es negativo");
            }
        
        // ------------ Ejercicio 02 ------------
            System.out.println("Introduce un numero: ");
            int n1=sc.nextInt();
        
            if ( n1%5 == 0){
                System.out.println("El numero " + n1 + " es multiplo de 5");
            } else {
                System.out.println("El numero " + n1 + " no multiplo de 5");

            }
        
        // ------------ Ejercicio 03 ------------
            System.out.println("Introduce un numero: ");
            int n2=sc.nextInt();
        
            if (n2 >= 18){
                System.out.println("Eres mayor de edad");
            } else {
                System.out.println("Eres menor de edad");
            }
            System.out.println("Introduce el precio: ");
            double n3 = sc.nextDouble(); // Usamos double para decimales (precios)

        // ------------ Ejercicio 03 ------------
            if (n3 >= 100) {
                // Calculamos el 10% (n3 * 0.10)
                n3 -= (n3 * 0.10);
                System.out.println("El precio final es: " + n3);
            } else {
                System.out.println("Sin descuento. Precio total: " + n3);
            }
        
        // ------------ Ejercicio 04 ------------
            System.out.println("Introduce el primer número: ");
            int primer = sc.nextInt();

            System.out.println("Introduce el segundo  número: ");
            int segundo = sc.nextInt();
        
            if (primer > segundo) {
                System.out.println("El " + primer + " es mayor que " + segundo);
            } else {
                System.out.println("El " + segundo + " es mayor que " + primer);
            }
        
        // ------------ Ejercicio 10 ------------
            System.out.println("Introduce su edad: ");
            int edad = sc.nextInt();

            if (edad >= 16 && edad<=40 ) {
                System.out.println("Puedes participar en el concurso");
            } else {
                System.out.println("No puedes participar en el concurso");
            }
        
        // ------------ Ejercicio 10 ------------
            System.out.println("Introduce un número: ");
            int num = sc.nextInt();

            if (num % 2 == 0 ) {
                System.out.println("El " + num + " es par");
            } else {
                System.out.println("El " + num + " es impar");
            }
        
    }
}
