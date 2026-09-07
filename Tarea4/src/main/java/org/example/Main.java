package org.example;
import org.example.controller.ControllerApp;
import org.example.view.MainFrame;
import org.example.model.Model;
import org.example.view.MainFrame;
import javax.swing.SwingUtilities;
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Model modelo = new Model();
            MainFrame view = new MainFrame();
            ControllerApp controller = new ControllerApp();
            view.setVisible(true);
        });
    }
}
