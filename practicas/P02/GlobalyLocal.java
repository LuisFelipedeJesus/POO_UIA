public class GlobalyLocal {

    static byte matri = 120;

    static char let = 'M';

    static int capaci = 1550; // Entero tipo int

    static float diamet = 37.25f; // Tipo float. Una f o F final indica que es float.

    static double pes = 90.77; // Tipo double. Un número con punto decimal se interpreta normalmente como double.

    static short eda = 20; // Entero tipo short

    static long masa = 187723522; // Entero tipo long. Una l o L final indica que es long	

    public static void main(String[] args) {
        byte matricula = 120;

        char letra = 'L';

        int capacidad = 1500; // Entero tipo int

        float diametro = 34.25f; // Tipo float. Una f o F final indica que es float.

        double peso = 88.77; // Tipo double. Un número con punto decimal se interpreta normalmente como double.

        short edad = 19; // Entero tipo short

        long masa = 178823411L; // Entero tipo long. Una l o L final indica que es long
        System.out.println("La letra global es: " + let);
        System.out.println("Matricula global: " + matri);
        System.out.println("La capacidad global fue: " + capaci);
        System.out.println("El diametro global fue: " + diamet);
        System.out.println("El peso global fue: " + pes);
        System.out.println("La edad global fue: " + eda);
        System.out.println("La masa global fue: " + masa);
        System.out.println("La letra local es: " + letra);
        System.out.println("Matricula local: " + matricula);
        System.out.println("La capacidad local fue: " + capacidad);
        System.out.println("El diametro local fue: " + diametro);
        System.out.println("El peso local fue: " + peso);
        System.out.println("La edad local fue: " + edad);
        System.out.println("La masa local fue: " + masa);

	}
}