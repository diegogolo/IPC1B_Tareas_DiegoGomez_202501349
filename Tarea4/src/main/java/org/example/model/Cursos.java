package org.example.model;

public class Cursos {
    private Curso[] cursos = new Curso[20];
    private int total = 0;
    public boolean asignacion(Curso nuevo) {
        if(total>=cursos.length){
            return false;
        }
        for(int i=0;i<total;i++){
            if(cursos[i].getCode().equals(nuevo.getCode())){
                return false;
            }
        }
        cursos[total]=nuevo;
        total++;
        return true;
    }
    public boolean buscarCurso(String codigo){
        for(int i =0; i<cursos.length; i++){
            if(cursos[i].getCode().equals(codigo)){
                return true;
            }
        }
        return false;
    }

}
