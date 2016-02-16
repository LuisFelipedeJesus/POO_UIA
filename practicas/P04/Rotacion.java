import java.io.*;

public class Rotacion {

    public static void main(String[]args)throws IOException{

        int i;
        String entrada;
    
        /* En el programa se uso CharArt para separar la cadena de texto por caracter y 
        asi poder utlizarlos como requiera 
        Asi mismo se utlizo length que es un metodo que nos ayuda a saber la longitud de
        la cadena de caracteres
        Tambien se utilizo el metodo substrign que nos sirve para devolver la cadena */


        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresa  la frase a rotar :");
        entrada=br.readLine();
        entrada =entrada.toUpperCase();

        for(i=0;i<=entrada.length()-1;i++){

            entrada=entrada.charAt(entrada.length()-1)+ entrada.substring(0,entrada.length()-1);
            System.out.println(entrada);
            //System.out.println(entrada.toUpperCase());

        }
      
    }
}

