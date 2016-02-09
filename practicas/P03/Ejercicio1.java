public class Ejercicio1{

public static void main(String[] args){
	int a = 10, b = 3, c = 1, d, e;
float x, y;
boolean f;
x = a/b;
f= a < b && c <a;//en primer lugar es un booleano y por eso no corre y porque no pueden existir 2 valores para c  
d = a + b++;
e = ++a - b; //estaba mal escrito el signo de menos 
y = (float)a/b;
System.out.println("El resultado de x es: " + x);// al programa le faltaba imprimir resultados
System.out.println("El resultado de f es: " + f);
System.out.println("El resultado de d es: " + d);
System.out.println("El resultado de e es: " + e);
System.out.println("El resultado de y es: " + y);


}
}
