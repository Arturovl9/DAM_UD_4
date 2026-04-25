import java.util.Scanner;

public class Examen_GeometriaRota {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el radio: ");
        double radio = entrada.nextDouble();
        
        double longitud, areaCirculo, areaEsfera, Volumen;

        longitud = 2 * Math.PI * radio;
        areaCirculo = Math.PI * Math.pow(radio, 2); 
        areaEsfera = 4 * Math.PI * Math.pow(radio, 2);
        Volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        System.out.println("Longitud circunferencia: " + longitud);
        System.out.println("Area circulo: " + areaCirculo);
        System.out.println("Area esfera: " + areaEsfera);
        System.out.println("Volumen esfera: " + Volumen);
    }
}

