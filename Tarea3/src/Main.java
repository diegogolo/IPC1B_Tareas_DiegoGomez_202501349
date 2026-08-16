import java.util.Scanner;
public class Main{
    private static String[] names = new String[10];
    private static String[] notas = new String[10];
    private static Scanner read = new Scanner(System.in);
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

            switch (choice){
                case 1:
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
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
    public static void agregarEstudiante(){
        for (int i=0; i<10; i++){
            System.out.println("Ingresa el nombre del estudiante:");
            names[i]=read.nextLine();
            System.out.println("Ingresa la nota del estudiante:");
            try {
                notas[i]=read.nextLine();
            }catch (Exception e){

            }
        }
    }
}