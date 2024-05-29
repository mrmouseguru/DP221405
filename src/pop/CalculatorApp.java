package pop;

public class CalculatorApp {

    public static void main(String[] args) {//begin
        
        //make a call (gọi hàm)
        int c = multiply();
        System.out.println("Ket qua: " + c);
    
        return;   
    }//end

    static int multiply(){
        int a = 2;
        int b = 2;
        int c = a * b;
        return c;
    }

}
