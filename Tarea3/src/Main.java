import java.io.*;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final String[] names = new String[20];
    private static final int[] notas = new int[20];
    private static final Scanner read = new Scanner(System.in);
    private static int counter = 0;
    private static DecimalFormat fix2 = new DecimalFormat("#.00");
    public static void main(String[] args) {
        int choice=0;
        do {
            System.out.println("=== SISTEMA DE NOTAS ===");
            System.out.println("Ingresa una opción:");
            System.out.println("1 - Agregar estudiante");
            System.out.println("2 - Mostrar estudiante (ordenados por nota)");
            System.out.println("3 - Promedio del grupo");
            System.out.println("4 - Guardar datos en archivo");
            System.out.println("5 - Cargar datos desde archivo");
            System.out.println("6 - Salir");
           try{
               choice = read.nextInt();
               read.nextLine();
               if(choice >6){
                   throw new IllegalArgumentException("Opción fuera de rango");
               }
           }catch(InputMismatchException e){
               System.out.println("Opción inválida, vuelve a intentarlo");
               read.nextLine();
               choice=0;
           }catch(IllegalArgumentException e){
               System.out.println("Opción fuera de rango");
           }
            switch (choice) {
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    mostrarEstudiante();
                    break;
                case 3:
                    showPromedio();
                    break;
                case 4:
                    saveStudents();
                    break;
                case 5:
                    readStudents();
                    break;
            }
        } while (choice != 6);
        {
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
            names[counter] = null;
            notas[counter] = 0;
            counter=counter-1;
        } catch (IllegalArgumentException e) {
            System.out.println("Valor fuera del rango (0-100)");
            names[counter] = null;
            notas[counter] = 0;
            counter=counter-1;
        }
        counter++;
    }

    public static void mostrarEstudiante() {
        int hold;
        String holdname;
        for (int i = 0; i < counter; i++) {
            boolean intercambiable = false;
            for (int j = 0; j < counter - i - 1; j++) {
                if (notas[j] > notas[j + 1]) { //si la posición actual de notas es mayor que la j+1 se ejecuta el condicional.
                    hold = notas[j];    //la variable hold toma la nota que está en la posición por la que va pasando el for
                    notas[j] = notas[j + 1]; // luego la posición actual de notas se sobreescribe por la que tiene siguiente
                    notas[j + 1] = hold; //luego la nota de la posición j+1 pasa a estar en la variable hold

                    holdname = names[j];    // el mismo procedimiento es con los nombres, solo que en lugar de hold la variable se llama holdname
                    names[j] = names[j + 1];
                    names[j + 1] = holdname;
                    intercambiable = true;
                }
            }
            if (intercambiable == false) {
                break;  // si la variable intercambiable (ya no se cumple el condicional) es falso sale del bucle.
            }
        }
        for (int i = 0; i < counter; i++) {
            System.out.println(names[i] + " | " + notas[i]);
        }
        if (counter == 0) {
            System.out.println("No hay estudiantes registrados");
        }
    }
    public static double recursividad(int posi) {
        if (posi > counter) {
            return 0;
        }
        return notas[posi]+recursividad(posi+1);
    }
    public static void showPromedio(){
        double sumadeNotas = 0;
        double promedio;
        if(counter==0){
            System.out.println("No hay estudiantes registrados");
        }
        sumadeNotas = recursividad(0);
        promedio=sumadeNotas/counter;
        System.out.println("El promedio del grupo es: "+fix2.format(promedio));

        /*
        Explicación: lo que hice aquí fue crear un método llamado "public static double recursividad", esto es debido a que el método debe tener un argumento
        con el que se genera la recursividad, y no se puede hacer esto desde un void. Lo que hace el método es que el int declarado se va acumulando por cada pasada
        entonces, si no se cumple el condicional retorna el valor de la nota más el mismo método pero con el contador sumándole 1. Cuando se cumpla el condicional retorna 0
        indicando que ya se completó la suma y puede volver al método que lo llamó.
         */
    }
    public static void saveStudents(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("notas.txt"));
            for(int i=0;i<counter;i++){
                bw.write(names[i]);
                bw.write(",");
                bw.write(String.valueOf(notas[i]));
                bw.newLine();
            }
            bw.close();
            System.out.println("Se guardaron los datos con éxito");

        }catch(IOException e){
            System.out.println("No se pudo guardar el archivo");
        }
    }
    public static void readStudents(){
        int students=0;
        try{
            BufferedReader br = new BufferedReader(new FileReader("notas.txt"));
            String show;
            while ((show = br.readLine()) != null) {
                System.out.println(show);
                students++;
            }
            System.out.println("Se cargaron: "+students+" estudiantes");
        }catch(IOException e){
            System.out.println("No se pudo leer el archivo");
        }
    }
}
