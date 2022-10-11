package main.java.com.daniela;

import java.util.List;

public class PrimitivesAndTheirObjects {
    public static void main(String[] args) {
        int number = 1; //If we needed to work with "int" in an object like form then we use Integer giving us methods to choose from
        Integer number1 = 1;

        List<Integer> numbers = null; //This is creating a list of numbers
        // if we wanted to specify the type we would need to use generics
        // we would need to use "Integer" because it doesn't allow primitives
        // this allows access to methods

        numbers.add(1); //we used the "add()" method to add 1 to our List

        //every primitive has an object; it is the same name but starting with a capital letter
    }
}
