package org.example.controller;
import org.example.view.MainFrame;
import org.example.model.Model;
import org.example.model.Curso;
import org.example.model.Tarea;
import org.example.model.Temperatura;
import javax.swing.*;


public class ControllerApp {
    Model modelo = new Model();
    MainFrame view = new MainFrame();
    public static void main(String[] args){
        ControllerApp controller = new ControllerApp();
        controller.view.setController(controller);
    }
    public void registrarCurso(){
        try {
            String codigo = view.getPanelAsignacionCursos().getCodigo();
            String nombre = view.getPanelAsignacionCursos().getNombre();
            String tutor = view.getPanelAsignacionCursos().getTutor();
            Curso nuevo = new Curso();
            nuevo.setCode(codigo);
            nuevo.setName(nombre);
            nuevo.setTutor(tutor);
            boolean registrado = modelo.registrarCurso(nuevo);
            if(codigo.isEmpty() || nombre.isEmpty() || tutor.isEmpty()){
                view.showMensaje("Rellena todos los campos");
                return;
            }
            if(registrado){
                view.showMensaje("Se agregó el curso con éxito");
            }else{
                view.showMensaje("No se pudo agregar el curso");
            }

        }catch(NullPointerException e){
            view.showMensaje("Rellena todos los campos");
        }
    }
    public void registrarTareas(){
        try{
            String code = view.getPanelTareas().getCodigo();
            String title = view.getPanelTareas().getTitle();
            String desc = view.getPanelTareas().getDescripcion();
            String date = view.getPanelTareas().getDate();
            Tarea nueva = new Tarea();
            boolean comprobacion = modelo.buscarCurso(code);
            if(code.isEmpty() || title.isEmpty() || desc.isEmpty() || date.isEmpty()){
                view.showMensaje("Rellena todos los campos");
            }
            if(!comprobacion){
                view.showMensaje("El curso no ha sido asignado aún");
            }

            nueva.setHomework(title);
            nueva.setDescripcion(desc);
            nueva.setDate(date);

            boolean registrada = modelo.registrarTarea(nueva);
            if(registrada){
                view.showMensaje("Se registró con éxito la tarea");
                view.showMensaje(title+" "+desc+" "+date);
            }else{
                view.showMensaje("No se pudo registrar la tarea");
            }
        }catch(NullPointerException e){
            view.showMensaje("Rellena todos los campos");
        }
    }
}
