package com.kelani.uni.v4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//class name will be changed in future
public class FileReader {

    public Double[] getNumbers() throws IOException { //will change the method signature

        //read the number text file
        List<String> numbersStrs = Files.readAllLines(
                Paths.get("E:\\Y02 SEM01\\Software Construction\\calculator\\numbers.txt")
        );

        //exception handling

        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));

        return new Double[]{number1, number2};
    }

}
