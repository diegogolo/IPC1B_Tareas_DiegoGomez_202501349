package org.example.view;
import javax.swing.*;
import java.awt.*;
import org.example.controller.ControllerApp;
public class PanelTareas extends JPanel{
    private MainFrame mainframe;
    JTextField title, desc, date,Codigo;
    public PanelTareas(MainFrame mainframe){
        this.mainframe=mainframe;
        setLayout(new GridLayout(5,2));
        JLabel codigoCurso = new JLabel("Código del curso: ");
        codigoCurso.setHorizontalAlignment(SwingConstants.LEFT);
        Codigo = new JTextField();
        add(codigoCurso);
        add(Codigo);

        JLabel titulo = new JLabel("Tarea: ");
        titulo.setHorizontalAlignment(SwingConstants.LEFT);
        title = new JTextField();
        add(titulo);
        add(title);

        JLabel descripcion = new JLabel("Descripción");
        descripcion.setHorizontalAlignment(SwingConstants.LEFT);
        desc = new JTextField();
        add(descripcion);
        add(desc);

        JLabel fecha = new JLabel("Fecha de entrega: ");
        fecha.setHorizontalAlignment(SwingConstants.LEFT);
        date = new JTextField();
        add(fecha);
        add(date);

        JButton asignar = new JButton ("Asignar tarea");
        asignar.addActionListener(e->{
            mainframe.getController().registrarTareas();
        });
        add(asignar);
        JButton regresar = new JButton("Regresar al menú principal");
        regresar.addActionListener(e->{
            mainframe.paneles("Menu");
        });
        add(regresar);
    }
    public String getDescripcion(){
        return desc.getText();
    }
    public String getTitle(){
        return title.getText();
    }
    public String getDate(){
        return date.getText();
    }
    public String getCodigo(){
        return Codigo.getText();
    }
}
