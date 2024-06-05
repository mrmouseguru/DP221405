package buoi3.swing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculatorWindow extends JFrame{

    //field
    private JPanel jPanelRemote;
    private JLabel jLabelInputRemote1;

    CalculatorWindow(){

        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jPanelRemote = new JPanel();
        //jPanelRemote.setBackground(Color.BLUE);

        jLabelInputRemote1 = new JLabel("input1");
        jPanelRemote.add(jLabelInputRemote1);

        add(jPanelRemote);

    }

}
