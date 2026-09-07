package org.example.controller;
import org.example.model.Cursos;
import org.example.model.Model;
import org.example.view.MainFrame;
import org.example.view.PanelAsignacionCursos;

import javax.swing.*;

public class ControllerApp {
    private Cursos modelocursos;
    private PanelAsignacionCursos viewCursos;

    public ControllerApp(Cursos modelocursos, PanelAsignacionCursos viewCursos){
        this.modelocursos=modelocursos;
        this.viewCursos=viewCursos;
        this.viewCursos.getSave().addActionListener( e->{
            registrarCurso();
        });
    }
    public void registrarCurso(){
        String codigo = viewCursos.getCodigo();
        String nombre = viewCursos.getNombre();
        String tutor = viewCursos.getTutor();
        if(codigo.isEmpty() || nombre.isEmpty() || tutor.isEmpty()){
            JOptionPane.showMessageDialog(null,"Error de validación, debes llenar todos los campos");
        }
    }
    int codigo;
}
