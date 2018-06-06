import calculator.SimpleMaths;
import userInput.Instructions;
import userInput.UserInput;

public class RosieCore {

    UserInput userInput = new UserInput();

    Instructions info;
    UserInput input;
    SimpleMaths simpleMaths;

    public void startRosie(){
        this.info = new Instructions();
        this.input = new UserInput();
        this.simpleMaths = new SimpleMaths();
    }

//    switch ()
}
