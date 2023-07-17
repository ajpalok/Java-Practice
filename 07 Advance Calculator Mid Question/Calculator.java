public class Calculator{
    public int a;
    public int b;
    Calculator(int firstNumber, int secondNumber){
        this.a = firstNumber;
        this.b = secondNumber;
    }
    public int sum(){
        return a+b;
    }
    public int substract(){
        return a-b;
    }
}