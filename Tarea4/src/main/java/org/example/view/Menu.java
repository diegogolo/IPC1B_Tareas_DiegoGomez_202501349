package org.example.view;
import javax.swing.*;
import java.awt.*;
import org.example.controller.ControllerApp;
public class Menu extends JPanel {
    private MainFrame mainframe;

    public Menu(MainFrame mainframe){
        this.mainframe=mainframe;
        JLabel bienvenida = new JLabel("Bienvenido");
        add(bienvenida);
        JButton Curso = new JButton("Agregar curso");
        Curso.addActionListener( e->{
                mainframe.paneles("Asignación de cursos");
        });
        add(Curso);
        JButton Tarea = new JButton("Agregar tarea");
        Tarea.addActionListener( e->{
           mainframe.paneles("Asignación de tareas");
        });
        add(Tarea);
        JButton Conversiones = new JButton("Conversión de temperaturas");
        Conversiones.addActionListener( e->{
            mainframe.paneles("Conversión de temperaturas");
        });
        add(Conversiones);
    }
}