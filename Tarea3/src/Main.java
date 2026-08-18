import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{
    private static String[] names = new String[10];
    private static int[] notas = new int[10];
    private static Scanner read = new Scanner(System.in);
    private static int counter = 0;
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("=== SISTEMA DE NOTAS ===");
        System.out.println("Ingresa una opción:");
        System.out.println("1 - Agregar estudiante");
        System.out.println("2 - Mostrar estudiante (ordenados por nota)");
        System.out.println("3 - Promedio del grupo");
        System.out.println("4 - Guardar datos en archivo");
        System.out.println("5 - Cargar datos desde archivo");
        System.out.println("6 - Salir");
        choice = read.nextInt();
        read.nextLine();
            switch (choice){
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    mostrarEstudiante();
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    break;
            }
        }while (choice!=6);{
            System.out.println("Has salido del programa");
        }
    }
    public static void agregarEstudiante() {
        System.out.println("Ingresa el nombre del estudiante:");
        names[counter] = read.nextLine();
        System.out.println("Ingresa la nota del estudiante:");
        try {
            notas[counter] = read.nextInt();
            if (notas[counter] < 0 || notas[counter] > 100) {
                throw new IllegalArgumentException("La nota está fuera del rango");
            }
            System.out.println("Estudiante agregado");
        } catch (InputMismatchException e) {
            read.next();
            System.out.println("Nota no válida");
        } catch (IllegalArgumentException e) {
            System.out.println("Valor fuera del rango (0-100)");
        }
        counter++;
    }
    public static void mostrarEstudiante() {
        int hold;
        String holdname;
        for (int i = 0; i < counter; i++) {
            boolean intercambiable=false;
            for (int j = 0; j < counter-i-1; j++) {
                if (notas[j] > notas[j+1]) {
                    hold=notas[j];
                    notas[j] = notas[j+1];
                    notas[j+1]=hold;

                    holdname=names[j];
                    names[j]=names[j+1];
                    names[j+1]=holdname;
                    intercambiable=true;
                }r
            }
            if (intercambiable=false) {
                break;
            }
        }
        for (int i = 0; i < counter; i++) {
            System.out.println(names[i] + " | " + notas[i]);
        }
        if (counter == 0) {
            System.out.println("No hay estudiantes registrados");
        }
    }
}