import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {

        int calificacion;
        float media;

        Scanner entrada = new Scanner(System.in);

        calificacion= entrada.nextInt();
        media = entrada.nextFloat();


        System.out.println("Introduzca una calificacion");

        if (calificacion < 0){
            System.out.println("No se han introducido calificaciones");
        } else if (calificacion >= 5) {
            System.out.println("Aprobados: " + calificacion);
        }else {
            System.out.println("Suspensos " + calificacion);
        }
    }
}
