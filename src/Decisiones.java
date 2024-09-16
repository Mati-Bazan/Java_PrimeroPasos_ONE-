public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String TipoPlan = "Plus";

        if (fechaDeLanzamiento >= 2022) {
            System.out.println("Peliculas mas populares");
        } else {
            System.out.println("Peliculas retro");
        }

        if (incluidoEnElPlan || TipoPlan.equals("Plus")) { // O, Or = ||, && = Y
            System.out.println("Distruta de tu pelicula");
        } else {
            System.out.println("Pelicula no disponible en su plan");
        }
    }
}
