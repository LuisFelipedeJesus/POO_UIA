import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero = 0;
        int entrada = 0;
        Random rd = new Random();
        numero = rd.nextInt(100 - 1 + 1) + 1;//aqui declaramos los numeros aleatorios del 1 al 100
        System.out.println("                     EMPECEMOS A JUGAR                       ");
        System.out.println("\nSE HA GENERADO UN NUMERO ALEATORIO ENTRE EL 1 Y EL 100 ADIVINA CUAL ES \n");

        System.out.println("INTRODUCE EL VALOR QUE CREES QUE ES: ");
        while (numero != entrada) {
            entrada = leer.nextInt();
            if (entrada < numero) {// es la condicon de que el numero es menor
                System.out.println("\nNO HAS ACERTADO EL NUMERO ES MENOR. INTENTALO DE NUEVO:  \n");
            } else if (entrada > numero) {//es la condicion de que el numero es mayor
                System.out.println("\nNO HAS ACERTADO EL NUMERO ES MAYOR. INTENTALO DE NUEVO:  \n");
            } else if (entrada == numero) {// es la igualdad y con lo que se gana 
                System.out.println("\nFELICIDADES HAS ACERTADO " + entrada);
            }
        }

    }
}