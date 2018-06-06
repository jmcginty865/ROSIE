package calculator;


import userInput.Instructions;

public class SimpleMaths{

    private long firstNum;
    private long secondNum;
    private long sum = 0;

    public long addNums(long firstNum, long secondNum){
        sum = firstNum + secondNum;
        return sum;
    }

    public long subtractNums(long firstNum, long secondNum){
        sum = firstNum - secondNum;
        return sum;
    }

    public long multipyNums(long firstNum, long secondNum){
        sum = firstNum * secondNum;
        return sum;
    }

    public long divideNums(long firstNum, long secondNum){
        sum = firstNum/secondNum;
        return sum;
    }
}
