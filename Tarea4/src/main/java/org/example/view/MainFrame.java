    package org.example.view;
    import org.example.controller.ControllerApp;
    import java.awt.*;
    import java.util.Scanner;
    import javax.swing.*;

    public class MainFrame extends JPanel {
        JFrame frame = new JFrame();
        private PanelAsignacionCursos panelasignacioncursos;
        private PanelTareas panelTareas;
        private PanelConversiones panelConversiones;

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
            frame.add(this.panelasignacioncursos, "Asignación de cursos");
            this.panelTareas = new PanelTareas(this);
            frame.add(this.panelTareas, "Asignación de tareas");
            this.panelConversiones=new PanelConversiones(this);
            frame.add(this.panelConversiones, "Conversiones");
            frame.setVisible(true);
        }
        public void paneles(String panel){
            CardLayout cl = (CardLayout) frame.getContentPane().getLayout();
            cl.show(frame.getContentPane(), panel);
        }
        public ControllerApp getController(){
            return controller;
        }

        public PanelAsignacionCursos getPanelAsignacionCursos(){
            return panelasignacioncursos;
        }
        public PanelTareas getPanelTareas(){
            return panelTareas;
        }
        public PanelConversiones getPanelConversiones(){
            return panelConversiones;
        }
        public void showMensaje(String mensaje){
            JOptionPane.showMessageDialog(frame,mensaje);
        }
    }
