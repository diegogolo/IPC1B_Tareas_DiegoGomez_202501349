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
    public boolean registrarTarea(Tarea nueva){
        return tareas.asignacion(nueva);
    }
    public boolean buscarCurso(String codigo){
        return cursos.buscarCurso(codigo);
    }
    public double farenheit(double temperatura){
        return conversion.farenheit(temperatura);
    }
    public double kelvin(double temperatura){
        return conversion.kelvin(temperatura);
    }
}
