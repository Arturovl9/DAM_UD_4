import java.util.Scanner;

public class Examen_Nomina {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el salario base: ");
        double salarioBase = entrada.nextDouble();
        
        System.out.print("Introduce el complemento: ");
        double complemento = entrada.nextDouble();
        
        System.out.print("Introduce las horas extras realizadas: ");
        double horaExtra = entrada.nextDouble();
        
        System.out.print("Introduce el pago recibido por horas extra: ");
        double precioHoraExtra = entrada.nextDouble();
        
        double bruto = salarioBase + complemento + horaExtra * precioHoraExtra;
        
        double seguridadSocial = bruto * 0.0635;
        double irpf = bruto * 0.15;

        double neto = bruto - seguridadSocial - irpf;

        double pagasExtrasAnuales = bruto * 2;
        double pagasExtrasMensuales = pagasExtrasAnuales / 12;

        double netoConProrrata = neto + pagasExtrasMensuales;

        System.out.println ("Bruto mensual: " + bruto);
        System.out.println ("Seguridad Social: " + seguridadSocial);
        System.out.println ("IRPF: " + irpf);
        System.out.println ("Neto sin prorrata: " + neto);
        System.out.println ("Importe pagas extras anuales: " + pagasExtrasAnuales);
        System.out.println ("Prorrata mensual de pagas extras: " + pagasExtrasMensuales);
        System.out.println ("Neto mensual con prorrata: " + netoConProrrata);
    }
}