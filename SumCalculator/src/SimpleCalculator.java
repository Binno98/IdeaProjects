public class SimpleCalculator {

   private double firstNumber;
            private double  secondNumber;


    public double getFirstNumber(){
        return firstNumber;
    }

    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double value){
        this.firstNumber=value;
    }

    public void setSecondNumber(double value){
        this.secondNumber=value;
    }

    public double getAdditionResult(){
        double result=firstNumber+secondNumber;
        return result;
    }

    public double getSubtractionResult(){
        double result=firstNumber-secondNumber;
        return result;
    }

    public double getMultiplicationResult(){
        double result=secondNumber*firstNumber;
        return result;
    }

    public double getDivisionResult(){
        double result=secondNumber/firstNumber;
        return result;
    }

}
