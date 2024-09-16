import java.util.Scanner;

public class Proyecto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("*********************************");
        System.out.println("\nNombre del cliente: "+ nombre);
        System.out.println("Tipo de cuenta: "+ tipoDeCuenta);
        System.out.println("Saldo disponible: "+ saldo + "$");
        System.out.println("\n*********************************");

        String menu = """
                ***** Escriba el numero de la opcion deseada *****
                1 - Consultar saldo.
                2 - Retirar.
                3 - Depositar.
                9 - Salir.
                """;

        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;

                case 2:
                    System.out.println("¿Cual es el monto que decia retirar?: ");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo actualizado es: " + saldo + "$");
                    }
                    break;
                case 3:
                    System.out.println("¿Cual es el monto que decia depositar?: ");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;
                case 9:
                    System.out.println("Saliento del programa");
                    break;
                default:
                    System.out.println("Esta opcion no es valida");
            }
        }
    }
}
