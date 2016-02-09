import java.io.*;
public class Ejercicio3{
	
	public static void main (String[] args){

		int a ;
		int b ; 
		java.util.Scanner leer = new java.util.Scanner (System.in);
	
		do{
			System.out.println("Introduce el valor de a: ");
			a = leer.nextInt();
			System.out.println("Introduce el valor de b: ");
			b = leer.nextInt();


		} while (( a < 0) && ( b < 0));// confirmacion de que a sean positivos
		
	
		if(a>b){ // aqui se verifica que a sea menor que b
			int aux;
			aux=b;// antes de cambiar el valor de b lo guarda en nuestra variable auxiliar
			b=a;// Ahora se le asigna el valor de A
			a=aux;// Se le asigna el valor de aux a A

		}

		int suma = 0;
		for (int i=a; i<=b; i++)
			if( i % 5 == 0)
			{

				suma += i;
				System.out.println("Multiplo de 5: " + i);

			}
			System.out.println("La suma de los multiplos de 5 entre a y b es:" + suma);
		
	}
}

