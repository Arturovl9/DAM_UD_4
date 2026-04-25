import java.util.Scanner;

public class UD4_Apartado5_CondicionesCompuestas {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //------------ Ejercicio 2 ------------
            System.out.println("Introduce su edad: ");
            int edad1 = sc.nextInt();

            if (edad1 >= 18 ) {
                System.out.println("Mayor de edad");
            } else {
                System.out.println("Menor de edad");
            }

        //------------ Ejercicio 3 ------------
            final double IVA =0.21;
            System.out.print("Introduce el precio del producto: ");
            double precio = sc.nextDouble();

            System.out.print("¿Tiene NIF? (true/false): ");
            boolean tienesNIF = sc.nextBoolean();

            if (tienesNIF) {
                double precioFinal = precio * IVA;
                System.out.println("Precio con IVA: " + precioFinal);
            } else {
                System.out.println("El precio sin iva: " + precio);
            }
        
        //------------ Ejercicio 4 ------------
            System.out.print("Introduce un número: ");
            double numEn = sc.nextDouble();

            if (numEn >= 0) {
                System.out.println("El numéro " + numEn + " es positivo");
            } else {
                System.out.println("El numéro " + numEn + " es negativo");
            }
        
        //------------ Ejercicio 5 ------------
            System.out.println("Introduzca el primer número:");
            int numCom1 = sc.nextInt();

            System.out.println("Introduzca el segundo número:");
            int numCom2 = sc.nextInt();
            
            if (numCom1 == numCom2) {
                System.out.println("Ambos números son iguales");
            } else {
                if (numCom1>numCom2) {
                    System.out.println("El número " + numCom1 + " es el mayor");
                } else {
                    System.out.println("El número " + numCom2 + " es el mayor");
                }
            }
        
        //------------ Ejercicio 6 ------------
            final int Descuento = 20;
            System.out.print("Introduce el precio de la cuota: ");
            double cuota = sc.nextDouble();

            System.out.print("¿Eres premium? (true/false): ");
            boolean esPremium = sc.nextBoolean();

            if (esPremium) {
                double cuotaFinal = cuota - Descuento;
                System.out.println("Precio con IVA: " + cuotaFinal);
            } else {
                System.out.println("El precio sin iva: " + cuota);
            }
    }
}
