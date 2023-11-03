import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un número");
        numero= entrada.nextInt();


        for (int i = 10; i < numero; i +=5) {
            if (numero % 2 == 0){
                i +=5;
            }
            for (int j = 10; j < numero ; j+=3) {
                if (numero % 3 == 0){
                    j +=3;
                }
                System.out.println(i +=5);
                System.out.println(j +=3);
            }

        }


    }
}
