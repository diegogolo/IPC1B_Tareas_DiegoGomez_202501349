package org.example.view;
import javax.swing.*;
import java.awt.*;
import org.example.controller.ControllerApp;
public class PanelAsignacionCursos extends JPanel {
    private MainFrame mainframe;
    private JTextField Codigo = new JTextField();
    private JTextField Tutor = new JTextField();
    private JTextField Nombre = new JTextField();
    private JButton save = new JButton("Guardar curso");
    private JButton regresar = new JButton ("Regresar al menú");
    public PanelAsignacionCursos(MainFrame mainframe){
        this.mainframe=mainframe;
        setLayout(new GridLayout(5,2));
        add(new JLabel("Código del curso"));
        add(Codigo);
        add(new JLabel("Nombre del curso"));
        add(Nombre);
        add(new JLabel("Tutor del curso"));
        add(Tutor);
        add(save);
        add(regresar);
        regresar.addActionListener( e ->{
            mainframe.paneles("Menú");
        });
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
    public JButton getSave(){
        return save;
    }

}
