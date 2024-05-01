import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int fechaLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean planBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio
                """;
        double mediaEvaluacion = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println("Año de lanzamiento: " + fechaLanzamiento);
        System.out.println("Puntaje: " + evaluacion);
        System.out.println("Inlcuido en el Plan Basico: " + planBasico);
        System.out.println("Reseña: " + sinopsis);

        if (fechaLanzamiento >= 2023){
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix: ");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacion = mediaEvaluacion + notaMatrix;
        }

        System.out.println("La media de la pelicula Matrix es: " + mediaEvaluacion / 3);
    }
}