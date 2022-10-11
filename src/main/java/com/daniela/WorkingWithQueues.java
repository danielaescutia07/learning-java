package main.java.com.daniela;

import java.util.LinkedList;
import java.util.Queue;

//First in first out (or FIFO)
public class WorkingWithQueues {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(); //Instead of passing a type we would pass our class; optional

        queue.add(new Person("James")); //this is how we add names using our Person class
        queue.add(new Person("Jamila"));
        queue.add(new Person("Abu"));

        System.out.println(queue);

        System.out.println(queue.peek()); //.peek() will return James since he's first in line

        queue.poll(); //.poll() will remove first in line

        System.out.println(queue);

        //Looping
        queue.forEach(person -> System.out.println(person.name));

    }

    static class Person { //we created a class; with a name property and constructor; we also included a toString()
        String name;

        Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

}
