import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] notas = new int[5];
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
                    if (preadd <= 10 && preadd >= 0) {
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
        int min = notas[0];
        int may = notas[0];
        for (i=0; i<5; i++) {
            if (notas[i]> may) {
                may = notas[i];
            }
            if (notas[i]<min){
                min = notas[i];
            }
        }
        System.out.println("El número menor es "+min+" y el mayor es "+may);
        int sum=0;
        for (i=0; i<5; i++){
            sum=sum+notas[i];
        }
        double avg=sum/5;
        System.out.println("El promedio es "+avg);
        matrix(i);
    }

    //Parte II (Matriz)

    static void matrix(int i){
        int j=0;
        boolean stop = false;
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el porcentaje de asistencia de 10 clases");
        System.out.println("0-100%");
        int save;
        int assistance[][]= new int[2][5];
        for (i=0; i<2; i++){
            for (j=0; j<5; j++){
                while (stop==false) {
                    if (leer.hasNextInt()) {
                        save = leer.nextInt();
                        if (save <= 100 && save >= 0) {
                            assistance[i][j] = save;
                            System.out.println("Valor guardado");
                            break;
                        } else {
                            System.out.println("La asistencia debe estar entre 0 y 100%");
                        }
                    } else {
                        System.out.println("Valor incorrecto, vuelve a escribirlo");
                        leer.next();
                    }
                }
            }
        }
        for (i=0; i<2; i++){
            for (j=0; j<5; j++){
                System.out.print(assistance[i][j]+" | ");
            }
        }
        System.out.println("Promedio de las asistencias");
        int suma=0;
        double prom;
        for (i=0; i<2; i++){
            for (j=0; j<5; j++){
                suma=suma+assistance[i][j];
            }
        }
        prom=suma/10;
        System.out.println("El promedio de las asistencias es de "+prom);

    }
}