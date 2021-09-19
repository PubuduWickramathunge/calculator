package com.kelani.uni.v5.operation;

public class DivOperation implements Operation {

    public Double execute(Double[] numbers) throws InvalidCalOperationException {

        if(numbers[1] == 0){
            throw new InvalidCalOperationException("Do Not divide by Zero.");
        }

        return numbers[0] / numbers[1];

    }

}
