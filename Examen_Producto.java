import java.util.Scanner;

public class Examen_Producto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el nombre del primer producto: ");
        String producto1 = entrada.nextLine();
        System.out.println("\nIntroduce el precio del primer producto: ");
        double precio1 = entrada.nextDouble();
        System.out.println("\nIntroduce la cantidad escogida del primer producto: ");
        double cantidad1 = entrada.nextDouble();
        
        entrada.nextLine();
        
        System.out.println("\nIntroduce el nombre del segundo producto: ");
        String producto2 = entrada.nextLine();        
        System.out.println("\nIntroduce el precio del segundo producto: ");
        double precio2 = entrada.nextDouble();        
        System.out.println("\nIntroduce la cantidad escogida del primer producto: ");
        double cantidad2 = entrada.nextDouble();
        
        entrada.nextLine();
        
        System.out.println("\nIntroduce el nombre del tercer producto: ");
        String producto3 = entrada.nextLine();
        System.out.println("\nIntroduce el precio del primer producto: ");
        double precio3 = entrada.nextDouble();        
        System.out.println("\nIntroduce la cantidad escogida del primer producto: ");
        double cantidad3 = entrada.nextDouble();
        
        double subtotal1 = precio1 * cantidad1;
        double subtotal2 = precio2 * cantidad2;
        double subtotal3 = precio3 * cantidad3;
        
        double totalSinIva = subtotal1 + subtotal2 + subtotal3;
        double iva = totalSinIva * 0.21;
        double totalConIva = totalSinIva + iva;
        
        double precioMedio = totalSinIva / (cantidad1 + cantidad2 + cantidad3);
        
        System.out.println ("Subtotal " + producto1 + ": " + subtotal1);
        System.out.println ("Subtotal " + producto2 + ": " + subtotal2);
        System.out.println ("Subtotal " + producto3 + ": " + subtotal3);
        System.out.println ("Total sin IVA: " + totalSinIva);
        System.out.println ("IVA (21%): " + iva);
        System.out.println ("Total con IVA: " + totalConIva);
        System.out.println ("Precio medio por unidad: " + precioMedio);
    }
}
