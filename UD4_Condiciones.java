import java.util.Scanner;

public class UD4_Condiciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Ejercicio 1
        
            
            int nota;

            System.out.print("Dame un número entre 0 y 10:");
            nota = entrada.nextInt();

            if (nota < 5){
                System.out.println("Insuficiente. Reprovaste cabroncete");
            } else if (nota < 6) {
                System.out.println("Suficiente. Ni bien ni mal Aprobado XD");
            } else if (nota < 7) {
                System.out.println("Bien. En el siguiente más nota nene");                
            } else if (nota < 9) {
                System.out.println("Notable. Esta bien chiquillo");
            } else {
                System.out.println("Sobresaliente. ¡¡¡Vamos niño!!!");
            }
        
        // Ejercicio 2
            int dia;

            System.out.println("\nIntroduzca un dia: ");
            dia = entrada.nextInt();

            switch (dia) {
                case 1:
                    System.out.println("Lunes");
                    break;

                    case 2:
                    System.out.println("Martes");
                    break;

                    case 3:
                    System.out.println("Miercoles");
                    break;

                    case 4:
                    System.out.println("Jueves");
                    break;

                    case 5:
                    System.out.println("Viernes");
                    break;

                    case 6:
                    System.out.println("Sabado");
                    break;

                    case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Error el número debe estar entre 0 y 7");
   
            }
       
        
    }
}
