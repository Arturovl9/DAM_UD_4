import java.util.Scanner;

public class Examen_NumeroEntero {
 
    public static void main(String[] args) { 
 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Introduce la hora en formato HHMM (ej. 930 para 09:30): "); 
        int hhmm = scanner.nextInt(); 
        
        int h = hhmm / 100; 
        int m = hhmm % 100; 
 
        String horaF = String.format("%02d:%02d", h, m); 
 
        int totalM = h * 60 + m; 
        long totalS = (long) totalM * 60; // Usamos 'long' para asegurar que el cálculo sea seguro 
        boolean MediaNoche = (h == 0) && (m == 0); 
        boolean Mediodia = (h == 12) && (m == 0); 
        boolean HoraValida = (h >= 0) && (h <= 23) && (m >= 0) && (m <= 59); 
 
        System.out.println("Hora: " + horaF); 
        System.out.println("Total de minutos desde 00:00: " + totalM + " minutos"); 
        System.out.println("Total de segundos desde 00:00: " + totalS + " segundos"); 
        System.out.println("¿Es medianoche? " + MediaNoche); 
        System.out.println("¿Es mediodia? " + Mediodia); 
        System.out.println("¿Hora Valida? " + HoraValida); 
    }   
}
