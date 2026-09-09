package org.example.view;
import javax.swing.*;
import java.awt.*;
import org.example.controller.ControllerApp;
public class Menu extends JPanel {
    private MainFrame mainframe;

    public Menu(MainFrame mainframe){
        this.mainframe=mainframe;
        setLayout(new GridLayout(4,1));
        JLabel bienvenida = new JLabel("Bienvenido");
        bienvenida.setHorizontalAlignment(SwingConstants.CENTER);
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
            mainframe.paneles("Conversiones");
        });
        add(Conversiones);
    }
}