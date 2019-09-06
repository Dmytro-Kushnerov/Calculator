
package Calculator;

public class Operations extends CalcUI {
    
    private double num1, num2, result;
    private int operation;

    public Operations(double num1, double num2, double result, int operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
        this.operation = operation;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getResult() {
        return result;
    }

    public int getOperation() {
        return operation;
    }

    public double plusAction (){
        if (operation == 0){
           num1 = Double.parseDouble(String.valueOf(getjTextField().getText()));
       }
       else {
           num2 = Double.parseDouble(String.valueOf(getjTextField().getText()));
       } 
       if (operation == 1) {
           num1 += num2; 
       }
       if (operation == 2) {
           num1 -= num2; 
       }
       if (operation == 3) {
           num1 /= num2; 
       }
       if (operation == 4) {
           num1 *= num2; 
       }
  
       return num1;
       
    }

    public double negativeAction(){
        num1 = Double.parseDouble(String.valueOf(getjTextField().getText()));
        result = num1 * -1;
        
        return result;
    }
    
    public double minusAction(){
        if (operation == 0){
           num1 = Double.parseDouble(String.valueOf(getjTextField().getText()));
       }
       else {
           num2 = Double.parseDouble(String.valueOf(getjTextField().getText()));
       }
       if (operation == 1) {
           num1 += num2; 
       }
       if (operation == 2) {
           num1 -= num2; 
       }
       if (operation == 3) {
           num1 /= num2; 
       }
       if (operation == 4) {
           num1 *= num2; 
       }
       
       return num1;
    }
    
    
    public double divisionAction(){
        if (operation == 0){
           num1 = Double.parseDouble(String.valueOf(getjTextField().getText()));
       }
       else {
           num2 = Double.parseDouble(String.valueOf(getjTextField().getText()));
       }
       if (operation == 1) {
           num1 += num2; 
       }
       if (operation == 2) {
           num1 -= num2; 
       }
       if (operation == 3) {
           num1 /= num2; 
       }
       if (operation == 4) {
           num1 *= num2; 
       }
       
       return num1;
       
    }
}

