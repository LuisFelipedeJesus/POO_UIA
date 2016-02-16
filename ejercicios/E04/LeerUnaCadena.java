import java.io.*;
public class LeerUnaCadena {
public static void main(String[] args) throws IOException{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader flujoE = new BufferedReader(isr);
//Definir una referencia al flujo de salida
PrintStream flujoS = System.out;
String sdato;
flujoS.print("Introduzca un texto: ");
sdato = flujoE.readLine(); //leer una linea de texto
flujoS.println(sdato);
}
}