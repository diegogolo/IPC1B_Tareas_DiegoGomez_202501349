    package org.example.view;
    import org.example.controller.ControllerApp;
    import java.awt.*;
    import java.util.Scanner;
    import javax.swing.*;

    public class MainFrame extends JPanel {
        JFrame frame = new JFrame();
        private PanelAsignacionCursos panelasignacioncursos;
        private ControllerApp controller;
        public void setController(ControllerApp controller){
            this.controller=controller;
        }
        public MainFrame(){
            frame.setTitle("Aplicación");
            frame.setSize(500,500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new CardLayout());
            frame.add(new Menu(this), "Menu");
            this.panelasignacioncursos=new PanelAsignacionCursos(this);
            frame.add(new PanelAsignacionCursos(this), "Asignación de cursos");
            frame.setVisible(true);
        }
        public void paneles(String panel){
            CardLayout cl = (CardLayout) frame.getContentPane().getLayout();
            cl.show(frame.getContentPane(), panel);
        }
        public PanelAsignacionCursos getPanelAsignacionCursos(){
            return panelasignacioncursos;
        }
    }
