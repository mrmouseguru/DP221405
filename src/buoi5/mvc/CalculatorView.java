package buoi5.mvc;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import buoi5.mvc.observer.Subcriber;

public class CalculatorView extends JFrame implements Subcriber
        {

    // field
    private JPanel jPanelRemote;
    private JLabel jLabelInputRemote1,
            jLabelInputRemote2, jLabelOutputRemote;
    private JTextField jTextFieldInputRemote1,
            jTextFieldInputRemote2;
    private JButton addButon, suButton, mulButton, divButton;
    private CalculatorController calculatorControlRemote = null;
    private CalculatorModel calculatorModelRemote = null;
    CalculatorView() {
        calculatorModelRemote = new CalculatorModel();
        //dăng ký subcriber - View với MOdel là Publisher
        calculatorModelRemote.subcribe(this);
        calculatorControlRemote = new CalculatorController();
        buildPanel();

        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(jPanelRemote);

    }

    public void buildPanel() {

        jPanelRemote = new JPanel();
        // jPanelRemote.setBackground(Color.BLUE);

        jLabelInputRemote1 = new JLabel("input1");
        jPanelRemote.add(jLabelInputRemote1);
        jTextFieldInputRemote1 = new JTextField(10);
        jPanelRemote.add(jTextFieldInputRemote1);
        jLabelInputRemote2 = new JLabel("input2");
        jPanelRemote.add(jLabelInputRemote2);
        jTextFieldInputRemote2 = new JTextField(10);
        jPanelRemote.add(jTextFieldInputRemote2);
        jLabelOutputRemote = new JLabel("output");
        jPanelRemote.add(jLabelOutputRemote);
        addButon = new JButton("ADD");
        addButon.addActionListener(calculatorControlRemote);// calculatorWindowRemote===this
        jPanelRemote.add(addButon);
        suButton = new JButton("SUB");
        suButton.addActionListener(calculatorControlRemote);
        jPanelRemote.add(suButton);

    }

    class CalculatorController implements ActionListener{
        CalculatorController(){
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(
            jTextFieldInputRemote1.getText());
            double num2 = Double.parseDouble(jTextFieldInputRemote2.getText());
            String command = e.getActionCommand();
            // lấy data từ input1
            if (command.equals("ADD")) {
                calculatorModelRemote.add(num1, num2);
            }else if(command.equals("SUB")){
                calculatorModelRemote.sub(num1, num2);
            }
    
        }
    
        
    }

    @Override
    public void update() {
        double result = calculatorModelRemote.getResult();
        jLabelOutputRemote.setText("" + result);
    } 

}
