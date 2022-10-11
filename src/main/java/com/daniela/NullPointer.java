package main.java.com.daniela;


public class NullPointer {
    public static void main(String[] args) {
        var brand = "amigoscode"; //We are allowed to use "var" although it is not best practice
//        System.out.println(brand.toUpperCase());

        String brand1 = null; //You cannot have a null value bind to "var"; we replaced with String data type
//        System.out.println(brand1.toUpperCase()); //We CANNOT use any method with a variable that has no value
                                                // expected output: NullPointer - Cannot invoke "String.toUpperCase()" because "brand1" is null
                                                // Null can only be used with objects
//        System.out.println(brand1);
        //Null simply means that the variable doesn't have a value set yet



        //*HANDLING NULL VALUES
        String brand2 = null;

//        if (brand2 != null) { //THIS IS AN OPTION OR WE CAN USE A TRY CATCH (BELOW)
//            System.out.println(brand2);
//        } else {
//            System.out.println("Brand is null");
//        }

        try {
            System.out.println(brand2.toUpperCase()); //Try avoiding "try catch" for null values
        } catch (NullPointerException e) {
            System.out.println("Brand is null");
        }

    }
}
