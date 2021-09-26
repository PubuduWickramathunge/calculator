package com.kelani.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class OperationFactoryTest {

    //test cases

    //1. if the operator is add -> should return an object of AddOperation class
    @Test
    public void should_return_AddOperation_object_when_operator_is_add() {

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("add");

        //verify that te operation object is a instance of AddOperation class
        assertThat(operation, instanceOf(AddOperation.class));
    }

    //2. if the operator is sub -> should return an object of SubOperation class
    @Test
    public void should_return_SubOperation_object_when_operator_is_sub() {

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("sub");

        //verify that te operation object is a instance of SubOperation class
        assertThat(operation, instanceOf(SubOperation.class));
    }

    //3. if the operator is mul -> should return an object of MulOperation class
    @Test
    public void should_return_MulOperation_object_when_operator_is_mul() {

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("mul");

        //verify that te operation object is a instance of AddOperation class
        assertThat(operation, instanceOf(MulOperation.class));
    }

    //4. if the operator is div -> should return an object of DivOperation class
    @Test
    public void should_return_DivOperation_object_when_operator_is_div() {

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("div");

        //verify that te operation object is a instance of DivOperation class
        assertThat(operation, instanceOf(DivOperation.class));
    }


}