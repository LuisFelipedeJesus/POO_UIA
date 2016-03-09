import java.io.*;

public class EjerCalculadora {

    public static double a, b,resultado;

    public EjerCalculadora() {

    }

    public double suma(double a, double b) {
        resultado = a + b;
        return resultado;

    }

    public double resta(double a, double b) {
        resultado = a - b;
        return resultado;

    }

    public double multiplicacion(double a, double b) {
        resultado = a * b;
        return resultado;

    }

    public double division(double a, double b) {
        if (b > 0) {
            resultado = a / b;
            return resultado;
        } else {
            return 0;

        }
    }

    public static void main(String[] args) throws IOException {
        int op = 0;
        EjerCalculadora object = new EjerCalculadora();
        do {
            while (true) {
                System.out.println("\t==MENU==");
                System.out.println("\t1-. Sumar");
                System.out.println("\t2-. Restar");
                System.out.println("\t3-. Multiplicar");
                System.out.println("\t4-. Dividir");
                System.out.println("\t5-. Salir");

                System.out.println("Seleccione la operacion deseada:");

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                op = Integer.parseInt(br.readLine());

                if (op > 0 && op < 5) {    

                    System.out.println("Ingresa el primer numero:");
                    double auxa = Double.parseDouble(br.readLine());

                    System.out.println("Ingresa el segundo numero:");
                    double auxb = Double.parseDouble(br.readLine());

                    switch (op) {       

                        case 1:
                            System.out.println("\n\t\tEl resultado es: " + object.suma(auxa, auxb) + "\n");
                            break;

                        case 2:
                            System.out.println("\n\t\tEl resultado es: " + object.resta(auxa, auxb) + "\n");
                            break;

                        case 3:
                            System.out.println("\n\t\tEl resultado es: " + object.multiplicacion(auxa, auxb) + "\n");
                            break;

                        case 4:
                            System.out.println("\n\t\tEl resultado es: " + object.division(auxa, auxb) + "\n");
                            break;

                        default:
                            break;
                    }
                } else {
                    System.out.println("Decidio salir, hasta luego");
                    System.exit(0); 

                 
                }
            }

        } while (op != 0 || op != 1 || op != 2 || op != 3 || op != 4 || op != 5);

    }
}
