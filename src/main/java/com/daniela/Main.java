package com.daniela; //package tells us where we are

import java.awt.*;
import java.time.LocalDate; //import tells us where it's from and allows us to use it
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Primitive types - storing simple values; value of the variable
        //These 4 allow to store whole numbers
        //An '_' (underscore) can be used every 3 digits for better readability; they will not show in console
        byte theByte = -128;
        short theShort = 8989;
        int theInt = 100;
        long theLong = 38484904894L; //lowercase/uppercase L is needed at the end

        //These 2 allow to store decimals
        float theFloat = 3.14F; //lowercase/uppercase F is needed at the end; stores 6-7 decimal digits
        double theDouble = 3.1415; //stores 16 decimal digits

        boolean isAdult = true; //allows only 2 option values; true or false

        char nameInitial = 'D'; //allows single character value with single quotes

        //sout - shortcut for System.out.println();
//        System.out.println(theByte);
//        System.out.println(theShort);
//        System.out.println(theInt);
//        System.out.println(theLong);
//        System.out.println(theFloat);
//        System.out.println(theDouble);
//        System.out.println(isAdult);
//        System.out.println(nameInitial);


        //Reference types or Non Reference types (or objects) - start with Uppercase; they have built-in behaviors; stores complex values; holds a reference to information related to that variable
        String name = new String("Daniela"); //Must use double quotes
        LocalDate now = LocalDate.now(); //Current date
        Date date = new Date();

        //Reserved Keywords - are words used for the Java language itself - cannot be used to name variables or methods


        //Arithmetic Operations (PEMDAS)
//        System.out.println(10 + 2);
//        System.out.println(10 - 2);
//        System.out.println(10 * 2);
//        System.out.println(10 / 2);
//        System.out.println(10 % 2);

        //Class Math
//        System.out.println(Math.abs(-10)); //turns it positive
//        System.out.println(Math.max(3.6, 10.11)); //returns max number
//        System.out.println(Math.min(3.6, 10.11)); //returns min number
//        System.out.println((int) Math.pow(5, 2)); //power; use int to return whole number else returns decimal
//        System.out.println((int) Math.sqrt(25)); //sq root; use int (or cast) to return whole number
//        System.out.println(Math.PI);

        //Comparison Operators; boolean expressions
        int khalidAge = 18;
        int mariamAge = 20;
//        System.out.println(khalidAge > mariamAge);
//        System.out.println(khalidAge >= mariamAge);
//        System.out.println(khalidAge < mariamAge);
//        System.out.println(khalidAge >= mariamAge);
//        System.out.println(khalidAge == mariamAge);
//        System.out.println(khalidAge != mariamAge);

        //Logical Operators; multiple boolean expression
        boolean isAdult2 = false;
        boolean isStudent = true;
        boolean isHired = true;

//        System.out.println(isAdult2 && isStudent); // both are required to be true to return true otherwise false will be returned
//        System.out.println(isAdult2 || isStudent); //only one is required to be true to return true
//        System.out.println((isAdult2 || isStudent) && isHired); //first logic is true since || is being used
//        System.out.println((!isAdult2 || isStudent) && isHired); //isAdult2 becomes true when ! is being used; flips value
//        System.out.println(isAdult2 == true); //== true is NOT needed since isAdult2 is a boolean

        //If statements; used with any boolean expressions
        int age = 17;
        if (age >= 18) { //This condition will not print since it's false unless value is flipped
//            System.out.println("Hooray... I am an adult");
        } else if (age >= 16 && age < 18) {
//            System.out.println("I am almost an adult");
        } else {
//            System.out.println("I am not an adult"); //Expected
        }

        //Ternary Operators; this comes in handy for neater appearance with statements that are not too complex
        int age1 = 15;
        String message = age >= 18 ? "Hooray... I am an adult" : "I am not an adult";
//        System.out.println(message);

        //Switch statements
        String gender = "FEMALE";

        if (gender.equals("FEMALE")) { //regular if statement

        } else if (gender.equals("MALE")) {

        } else if (gender.equals("PREFER_NOT_SAY")) {

        } else {

        }


        switch (gender) { //neater appearance; should be used when performing if conditions on one value
            case "FEMALE":
//                System.out.println("I am a female");
                break;
            case "MALE":
//                System.out.println("I am a male");
                break;
            case "PREFER_NOT_SAY":
//                System.out.println("Prefer not say");
                break;
            default:
//                System.out.println("Unknown gender");
        }



        //i++ / i--
        int [] numbers3 = {2, 0, 1, 4, 100, 4, 90, 78, 77};

        int number = 0;
//        System.out.println(number++); // Expected output is 1; ++ just adds 1; -- subtracts 1

        // Loops / Enhanced For Loops
        for (int i = 0; i < numbers3.length; i++) {
//            System.out.println(numbers3[i]);
        }

        for (int number1 : numbers3) { //For numbers takes individual index value and put it one by one in number1 variable; access to index is not allowed
//            System.out.println(number1); //Expected output is numbers3 array values
        }

        //Reverse Order
        for (int i = 0; i < numbers3.length; i--) {
//            System.out.println(numbers3[i]);
        }

        //Bonus Tip - IntelliJ Shortcut
        //When you begin with the arrays variable name followed by a period and then for
        //IntelliJ gives you for loop options to choose from saving you time
        // numbers3.for

//        Arrays.stream(numbers3).forEach(System.out::println); //Advance way to create for loops; output will be the same

        //Break and Continue
        String[] names2 = {"Paco", "Gabby", "Dani"};
        for (String name1 : names2) {
            if (name1 == "Gabby") { //If condition is met the for loop will break
                break; //Expected output - Paco
            } else {
//                System.out.println(name1);
            }
        }

        for (String name2 : names2) {
            if (name2.startsWith("G")) { //If condition is met it will skip over and continue
                continue; //Expected output - Paco, Dani
            } else {
//                System.out.println(name2);
            }
        }

        //While Loops - allows us to loop as long as condition is true; it breaks out of the loop once the condition is false
        int count = 0;
        while (count <= 20) { //this will loop until count reaches 20
//            System.out.println("count" + count);
            count++;
        }

        //Do While Loop - executes at least once
        int count1 = 0;
        do {
//            System.out.println(count1);
            count1++;
        }
        while (count1 <= 20);


        //Scanner class - allows use to take user input from the console
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String userName = scanner.nextLine(); //This takes the actual user's input
//        System.out.println("Hello " + userName);

//        System.out.println("How old are you?");
//        int age2 = scanner.nextInt();
//        int year = LocalDate.now().minusYears(age2).getYear(); //today's date - age2 = year born
//        System.out.println("You were born in " + year);

//        if (age2 < 18) {
//            System.out.println("You are not an adult");
//        } else {
//            System.out.println("You are an adult! :)");
//        }

        //Methods - block of code that runs when it's called; Built-in methods provided by Java environment; User predefined methods are method we build ourselves

//        System.out.println("Hello"); //println() was a method provided; inside parentheses we can include parameters
        String brand = "Apple";
//        System.out.println(brand.toUpperCase()); //toUpperCase() is also a method provided
//        System.out.println(brand.startsWith("S")); //startsWith() is also a method provided

        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        int count2 = countOccurrences(letters, 'A'); //we are invoking countOccurrences() method inside class Main
//        System.out.println(count2);


        //THIS IS WHERE WE'RE CREATING OUR OBJECT(S) USING "Lens"
        Lens lensOne = new Lens("sony", "85mm", true); //this is our newly created lens using Lens template
        Lens lensTwo = new Lens("sony", "30mm", true);
        Lens lensThree = new Lens("canon", "24-70mm", false);

//        System.out.println("Lens 1: " + lensOne.brand + " " + lensOne.focalLenght + " " +lensOne.isPrime);
//        System.out.println("Lens 2: " + lensTwo.brand + " " +lensTwo.focalLenght + " " +lensTwo.isPrime);
//        System.out.println("Lens 3: " + lensThree.brand + " " +lensThree.focalLenght + " " +lensThree.isPrime);


        //PASSPORT OBJECT
        Passport ukPassport = new Passport("1234", "England (UK)", LocalDate.of(2025, 1, 1));
        Passport usPassport = new Passport("12399", "USA", LocalDate.of(2030, 1, 1));


        //TODO - PART TWO
        int x = 0;
        int y = incrementValue(x);
        System.out.println(y);

        Point point = new Point(100, 100);
        changePoint(point);
        System.out.println(point);


        //"final" keyword for variable means you cannot change value (or reassign) value once assigned; same with classes

    } //main closing curly

    public static int countOccurrences(char[] letters, char searchLetter) { //public means this method is accessible by other classes; static means this method belongs to a class; int is the return type
        int count = 0;
        for (char letter : letters) {
            if (letter == searchLetter) {
                count++;
            }
        }
        return count;
    }

    //Classes & Objects - class is a blueprint to create anything you want; objects are what is created from the blueprint classes provide
    static class Lens { //Lens is our blueprint or template to creating a lens; we're using "static" so it'll allow us to use it in "static void main"
        String brand;
        String focalLenght;
        boolean isPrime;

        Lens(String brand, String focalLenght, boolean isPrime) { //this is the constructor - this is how we construct objects
            this.brand = brand; //this refers to an instance of Lens
            this.focalLenght = focalLenght;
            this.isPrime = isPrime;
            //To create objects by using the class Lens we have to create them in main
        }
    }

    //PASSPORT CLASS
    static class Passport {
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, String country, LocalDate expiryDate) {
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }

    //PART TWO
    //Pass By Value

    static int incrementValue(int value) {//void means the function/method won't return anything; when a primitive variable gets passed the value just gets copied; to fix this, we need to change from "void" to "int"
        return value + 1;
    }

    static void changePoint(Point point) {
        point.x = 0;
        point.y = 0;
    }

}