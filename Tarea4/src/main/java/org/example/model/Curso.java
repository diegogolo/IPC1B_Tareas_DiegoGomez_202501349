package org.example.model;

public class Curso {
    private String name;
    private int course_code;
    private String tutor_name;

    //setter y getters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getCode(){
        return course_code;
    }
    public void setCode(int course_code){
        this.course_code=course_code;
    }
    public String getTutor(){
        return tutor_name;
    }
    public void setTutor(String tutor){
        this.tutor_name=tutor;
    }
}
