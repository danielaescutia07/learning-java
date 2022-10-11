package main.java.com.daniela;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//In Java there's 2 types of exceptions
//Checked exceptions - need to be handled at compiled (try catch or throws keyword)
//Unchecked exceptions - exceptions are not checked at compiled time
public class TypesOfExceptions {
    public static void main(String[] args) {
        //*Checked exceptions
        try {
            FileInputStream inputStream = new FileInputStream("src/example.txt"); //this is how we read files
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        //*Unchecked exceptions
        try {
            var result = 10 / 0;
//            System.out.println(result);
        } catch (ArithmeticException | NullPointerException e) {
//            System.out.println("cannot divide number by 0");
        } finally { //occasionally
//            System.out.println("cleaning up...");
        }

        //Try - try anything you find in the curlys
        //Catch - pass exception if try fails; you can have as many catch blocks; but unless it's necessary don't do it
        //Finally - executes regardless


        //*Custom Exceptions
        System.out.println(performDivision(4, 0)); //since b = 0 our exception will throw; output: TypesOfExceptions$MyException: cannot divide by 0
    }

    static double performDivision(double a, double b) {

        if (b == 0) {
            throw new MyException("cannot divide by 0"); //we throw our exception here only if b = 0
        } else {
            return a / b;
        }
    }

    static class MyException extends RuntimeException { //We extend to RuntimeException
        public MyException(String message) {
            super(message);
        }
    }
}
