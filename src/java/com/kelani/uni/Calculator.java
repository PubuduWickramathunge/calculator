package com.kelani.uni;
import java.util.Scanner;
import java.io.*;

public class Calculator {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the operator ('add' for addition 'sub' for subtraction and 'mul' for multiplication): ");
        String operator = scanner.nextLine();
        int result = 0;



        Scanner file = new Scanner ( new File("numbers.txt"));
        int firstNumber = file.nextInt();
        int secondNumber = file.nextInt();

        switch(operator){
            case ("add"): result = firstNumber+secondNumber;
            break;
            case ("sub"): result = firstNumber-secondNumber;
            break;
            case ("mul"): result = firstNumber*secondNumber;
            break;

        }
        System.out.println(result);
    }
}
