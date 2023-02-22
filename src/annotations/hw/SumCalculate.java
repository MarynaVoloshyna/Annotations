package annotations.hw;

public class SumCalculate {
private int firstNumber = 0;
private int secondNumber = 0;

    public SumCalculate(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public SumCalculate() {
        super();
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public String toString() {
        return "SumCalculate{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }
    @MethodAnnotations(param1 = 10, param2 = 20)
    public int SumCulc(int a, int b){
        System.out.println( a + b);
        return  a + b;
    }
}
