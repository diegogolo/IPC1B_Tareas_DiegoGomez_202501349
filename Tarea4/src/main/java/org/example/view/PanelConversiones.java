package org.example.view;
import javax.swing.*;
import java.awt.*;
import org.example.controller.ControllerApp;
public class PanelConversiones extends JPanel {
    private MainFrame mainframe;
    JTextField temperatura;
    public PanelConversiones(MainFrame mainframe){
        this.mainframe = mainframe;
        setLayout(new GridLayout(2,1));

        JLabel tempe = new JLabel("Temperatura en Celsius");
        tempe.setHorizontalAlignment(SwingConstants.LEFT);
        temperatura = new JTextField();
        add(tempe);
        add(temperatura);

        JButton farenheit = new JButton("Conversión a farenheit");
        farenheit.addActionListener( e->{
            mainframe.getController().conversionFaren();
        });
        add(farenheit);
        JButton kelv = new JButton("Conversión a Kelvin");
        kelv.addActionListener( e->{
            mainframe.getController().conversionKelvin();
        });
        add(kelv);
    }
    public double getTemperatura(){
        return Double.parseDouble(temperatura.getText());
    }
}
