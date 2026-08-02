import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] notas = new int[5];
        double avg;
        int i = 0;
        System.out.println("Bienvenido al sistema de gestión de Calificaciones");
        ingresoDeDatos(read, notas, i);
    }

    static void ingresoDeDatos(Scanner read, int[] notas, int i) {
        System.out.println("Ingresa tu nombre");
        String name = read.nextLine();
        boolean value = false;
        int preadd;
        System.out.println("Ingresa tus notas (0-10): ");
        for (i = 0; i < 5; i++) {
            while (value == false) {
                if (read.hasNextInt()) {
                    preadd = read.nextInt();
                    if (notas[i] <= 10 && notas[i] >= 0) {
                        notas[i] = preadd;
                        System.out.println("Valor guardado");
                        break;
                    } else {
                        System.out.println("La nota debe estar entre 0 y 10");
                    }
                } else {
                    System.out.println("Nota no válida, vuelve a ingresarla");
                    read.next();
                }
            }
        }
        showArray(notas, i, name);
    }

    static void showArray(int[] notas, int i, String name) {
        System.out.println("Las notas de " + name + " Son:");
        for (i = 0; i < 5; i++) {
            System.out.print(notas[i] + " | ");
        }
        System.out.println(" ");
        values(notas, i);
    }

    static void values(int[] notas, int i){
        for (i=0; i<4; i++) {
            if (notas[i]<notas[i+1]){
                notas[i] = notas[i+1];
            }
        }
        System.out.println(notas[i]);
    }
}