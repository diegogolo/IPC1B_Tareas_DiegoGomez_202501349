package org.example.view;
import javax.swing.*;
import java.awt.*;
import org.example.controller.ControllerApp;
public class PanelAsignacionCursos extends JPanel {
    private MainFrame mainframe;
    JTextField Codigo, Tutor, Nombre;
    public PanelAsignacionCursos(MainFrame mainframe){
        this.mainframe=mainframe;
        setLayout(new GridLayout(5,2));

        JLabel nombreCurso = new JLabel("Nombre del curso: ");
        nombreCurso.setHorizontalAlignment(SwingConstants.LEFT);
        Nombre = new JTextField();
        add(nombreCurso);
        add(Nombre);

        JLabel tutorCurso = new JLabel("Tutor del curso: ");
        tutorCurso.setHorizontalAlignment(SwingConstants.LEFT);
        Tutor = new JTextField();
        add(tutorCurso);
        add(Tutor);

        JLabel codigoCurso = new JLabel("Código del curso: ");
        codigoCurso.setHorizontalAlignment(SwingConstants.LEFT);
        Codigo = new JTextField();
        add(codigoCurso);
        add(Codigo);

        JButton asignar = new JButton ("Asignar curso");
        asignar.addActionListener(e->{
           mainframe.getController().registrarCurso();
        });
        add(asignar);
        JButton regresar = new JButton("Regresar al menú principal");
        regresar.addActionListener(e->{
                mainframe.paneles("Menu");
        });
        add(regresar);


    }
    public String getCodigo(){
        return Codigo.getText();
    }
    public String getNombre(){
        return Nombre.getText();
    }
    public String getTutor(){
        return Tutor.getText();
    }

}
