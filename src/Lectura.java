import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita");
        String pelicula = teclado.nextLine(); // nextLine: Para tipo de datos string

        System.out.println("Escribe la fecha de lanzamiento");
        int fechaDelanzamiento = teclado.nextInt(); // nextInt: Para tipo de datos entero

        System.out.println("Que nota tiene esta pelicula");
        double nota = teclado.nextDouble(); // nextDouble: Para tipo de datos decimal | Ingresar datos con ","

        System.out.println(pelicula);
        System.out.println(fechaDelanzamiento);
        System.out.println(nota);
    }
}
