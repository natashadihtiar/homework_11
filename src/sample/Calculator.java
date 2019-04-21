package sample;

public class Calculator
{
    double number1;
    double number2;
    Operation operation;
    String result;
    boolean isFirstCalculation;
    private double memory;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public Calculator()
    {
        number1 = 0;
        number2 = 0;
        operation = Operation.unassigned;
        result = "0";
        isFirstCalculation = true;
    }

    public Operation getOperation()
    {
        return operation;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


    public void setFirstCalculation(boolean isFirstCalculation)
    { this.isFirstCalculation = isFirstCalculation;}

    public boolean isFirstCalculation() {
        return this.isFirstCalculation;
    }

    public void setOperation(Operation operation)
    {
        this.operation = operation;
    }

    public void calculate() {
        switch (operation) {
            case plus:  // +
                result = String.valueOf(number1 + number2); // number1 + number 2 + "";
                break;
            case minus:  // -
                result = String.valueOf(number1 - number2);
                break;
            case multiply:  // *
                result = String.valueOf(number1 * number2);
                break;
            case divide:   // /
                result = number2 == 0 ? "Division by zero" : String.valueOf(number1 / number2);
                break;
            case power:   // x^y
                result = String.valueOf(Math.pow(number1, number2));
                break;
            case sqrt:  // √
                result = number1 < 0 ? "No SQRT from negative" : String.valueOf(Math.sqrt(number1));
                break;

            case sin://sin
                result = String.valueOf(Math.sin(number1));
                break;

            case cos://cos
                result = String.valueOf(Math.cos(number1));
                break;
            case tg://tg
                result = String.valueOf(Math.cos(number1) != 0 ? String.valueOf(Math.sin(number1) / Math.cos(number1)) : "Can not be devited on 0! ");
                break;
            case ctg://ctg
                result = String.valueOf(Math.sin(number1) != 0 ? String.valueOf(Math.cos(number1) / Math.sin(number1)) : "Can not be devited on 0! ");
                break;
            case ln://ln
                result = String.valueOf(Math.log(number1));
                break;
            case log://log
                result = String.valueOf(Math.log10(number1));
                break;
            case multiply2://1/x
                result = String.valueOf(1/number1);
                break;
            default:
                result = "Unknown operation";
        }
        if (Double.parseDouble(result) != 0) {
            result = result.endsWith("0") ? result.substring(0, result.length() - 2) : result;
        }
    }
    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }
}