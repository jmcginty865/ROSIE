package calculator;


import userInput.Instructions;

public class SimpleMaths{

    Instructions intro;

    public SimpleMaths(){
     this.intro = new Instructions();
    }


//    private long amountOfNumbersAdded = intro.calculatorOption();
    private long firstNum;
    private long secondNum;
    private long sum = 0;

    public long addNums(){

        sum = firstNum + secondNum;
        return sum;
    }

    public long subtractNums(){
        sum = firstNum - secondNum;
        return sum;
    }

    public long multipyNums(){
        sum = firstNum * secondNum;
        return sum;
    }

    public long divideNums(){
        sum = firstNum/secondNum;
        return sum;
    }
}
