import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int[] notas = new int[5];
        double avg;
        int i=0;
        System.out.println("Bienvenido al sistema de gestión de Calificaciones");
        ingresoDeDatos(read, notas,  i);
    }
    static void ingresoDeDatos(Scanner read, int[] notas, int i){
        System.out.println("Ingresa tu nombre");
        String name = read.nextLine();
        System.out.println("Ingresa tus notas (0-10): ");
        for (i=0; i<5; i++ ){
            if (read.hasNextInt() && notas[i]<10){
                notas[i]=read.nextInt();
            }
            else{
                System.out.println("El valor que has ingresado no es válido");
                read.next();
            }
        }
    }
}