package org.example.model;

public class Tarea {
    private String homework;
    private String descripcion;
    private String date;
    private String code;

    public String getHomework(){
        return homework;
    }
    public void setHomework(String tarea){
        this.homework=tarea;
    }
    public String setDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String fecha){
        this.date=fecha;
    }
    public String getCode(){
        return code;
    }
    public void setCode(String course_code){
        this.code=course_code;
    }
}
