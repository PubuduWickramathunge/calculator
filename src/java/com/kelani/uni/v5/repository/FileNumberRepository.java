package com.kelani.uni.v5.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class FileNumberRepository implements NumberRepository {

    public Double[] getNumbers() throws IOException {

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