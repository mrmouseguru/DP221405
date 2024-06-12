package buoi4.ecb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorControl implements ActionListener{
    private CalculatorBoundary calculatorBoundaryRemote = null;
    private CalculatorEntity calculatorEntityRemote = null;

    CalculatorControl(CalculatorBoundary calculatorBoundaryRemote){
        calculatorEntityRemote = new CalculatorEntity();
        this.calculatorBoundaryRemote = calculatorBoundaryRemote;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(calculatorBoundaryRemote
        .getjTextFieldInputRemote1().getText());
        double num2 = Double.parseDouble(calculatorBoundaryRemote
        .getjTextFieldInputRemote2().getText());
        String command = e.getActionCommand();
        // lấy data từ input1
        if (command.equals("ADD")) {
            calculatorEntityRemote.add(num1, num2);
            double sum = calculatorEntityRemote.getResult();
            calculatorBoundaryRemote.getjLabelOutputRemote().setText("" + sum);
        }else if(command.equals("SUB")){
            calculatorEntityRemote.sub(num1, num2);
            double sum = calculatorEntityRemote.getResult();
            calculatorBoundaryRemote.getjLabelOutputRemote().setText("" + sum);

        }

    }

    
} 