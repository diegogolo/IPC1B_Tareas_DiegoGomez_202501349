package org.example;
import org.example.controller.ControllerApp;
import org.example.view.MainFrame;
import org.example.model.Model;
import org.example.model.Cursos;
import org.example.model.Tareas;
import org.example.model.Conversion;
import org.example.view.MainFrame;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Model modelo = new Model();
            Cursos cursos = new Cursos();
            MainFrame view = new MainFrame();
            ControllerApp controller = new ControllerApp(cursos, view.getPanelAsignacionCursos());
            view.setVisible(true);
        });
    }
}
