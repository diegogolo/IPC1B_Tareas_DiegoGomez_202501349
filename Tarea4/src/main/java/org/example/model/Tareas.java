package org.example.model;

public class Tareas {
    private Tarea[] tareas = new Tarea[50];
    private int totaltareas = 0;

    public boolean asignacion(Tarea nueva){
        if(totaltareas>tareas.length){
            return false;
        }
        for(int i= 0 ; i<totaltareas; i++){
            if(tareas[i].getCode()==nueva.getCode()) {
                return false;
            }
        }
        tareas[totaltareas]=nueva;
        totaltareas++;
        return true;
    }

}
