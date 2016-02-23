import java.io.*;

public class EjercicioCali {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader flujoE = new BufferedReader(isr);

        int n = 10;
        String[] nombre = new String[n]; // Se crea el arreglo de los nombres de los alumnos 
        double[] calificacion = new double[n]; //Se crea el arreglo de las calificaciones de los alumnos 
        String[] notas = new String[n]; //Se crea el arreglo de las notas de los alumnos 
        String[] revision = {"suspenso", "bien", "notable", "sobresaliente"}; //

        for (int i = 0; i < n; i++) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingresa  el nombre del alumno :");
            nombre[i] = br.readLine();

            System.out.println("Introduzca la calificacion del 0 al 10 del alumno " + nombre[i] + ":");
            calificacion[i] = Double.parseDouble(br.readLine());

            if (calificacion[i] >= 0 && calificacion[i] <= 10) {
                System.out.println("Tu registro fue correcto");
            } else {
                System.out.println("Error, recuerda que solo son calificaciones del 0 al 10");
            }

            if (calificacion[i] >= 0 && calificacion[i] <= 4.99) {
                notas[i] = revision[0];
            } else if (calificacion[i] >= 5 && calificacion[i] <= 6.99) {
                notas[i] = revision[1];
            } else if (calificacion[i] >= 7 && calificacion[i] <= 8.99) {
                notas[i] = revision[2];
            } else if (calificacion[i] >= 9 && calificacion[i] <= 10) {
                notas[i] = revision[3];
            }

        }

        System.out.println("\n ===  Los resultados de tu arreglo final son las siguientes  === \n");
        for (int i = 0; i < n; i++) {
            System.out.println("El alumno " + nombre[i] + ", Tiene de Calif. " + calificacion[i] + ", " + notas[i]);
        }
    }
}

