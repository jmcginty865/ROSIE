package userInput;

public class Instructions {

    UserInput input;

    public Instructions(){
        this.input = new UserInput();
    }


    public void intialInstructions(){
        System.out.println("What would you like me to do?");
    }

    public void calculatorOption(){
        System.out.println("What math function would you like to do?");
    }

}
