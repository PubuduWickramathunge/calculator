package com.kelani.uni.v4;

import com.kelani.uni.v4.operation.*;

import java.io.IOException;

//LISKOV substitution principle
public class Main {
    //main class is the coordinator
    public static void main(String[] args) throws IOException {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance(operator);
        Double result = operation.execute(numbers);

        UI ui = new UI();
        ui.showMessage("The result is " + result);

    }
}