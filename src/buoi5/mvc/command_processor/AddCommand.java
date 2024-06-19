package buoi5.mvc.command_processor;

import buoi5.mvc.CalculatorModel;

public class AddCommand extends Command{

    private double num1, num2;
    public AddCommand(double num1, double num2, 
    CalculatorModel calculatorModelRemote){
        this.num1 = num1;
        this.num2 = num2;
        this.calculatorModelRemote = calculatorModelRemote;
    }

    @Override
    public void execute() {
        calculatorModelRemote.add(num2, num1);
    }

}
