package main.java.com.daniela;

import java.util.ArrayList;
import java.util.List;

public class Statics { //static means it belongs to the class and are not instances

    public static String BRAND; //this is a constant; all uppercase; can be access
    static List list;

    static {
        BRAND = "xprsv"; //we can access BRAND like this
        list = new ArrayList(); //we can access list like this and add stuff to it
        list.add("Leo");
        list.add("Jula");
    }

    public static void main(String[] args) { // main - the entry point of every Java program; it has to be static;
        Person alex = new Person("Alex");
        Person bob =  new Person("Bob");
//      System.out.println(Person.createdPeople); //this will print out how many people were created; outcome "2"

        //static is shared across all objects
    }

    static class Person { //when you don't create an instance outside then it has to be static
        static int createdPeople = 0;
        String name;
        Person(String name) { //we are creating a person and incrementing by 1
            this.name = name;
            createdPeople++;
        }
    }
}
