package org.example.model;

public class Model {
    private Cursos cursos;
    private Tareas tareas;
    private Conversion conversion;

    public Model(){
        cursos=new Cursos();
        tareas=new Tareas();
        conversion=new Conversion();
    }
    public boolean registrarCurso(Curso nuevo){
        return cursos.asignacion(nuevo);
    }
}
