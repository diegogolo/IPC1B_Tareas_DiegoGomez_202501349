package org.example.model;

public class Curso {
    private String name;
    private String course_code;
    private String tutor_name;

    //setter y getters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getCode(){
        return course_code;
    }
    public void setCode(String course_code){
        this.course_code=course_code;
    }
    public String getTutor(){
        return tutor_name;
    }
    public void setTutor(String tutor){
        this.tutor_name=tutor;
    }
}
