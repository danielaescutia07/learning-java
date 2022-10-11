package main.java.com.daniela;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        //Lists will allow any data type to get added and for best practice we should enforce what data types should be allowed
        //In order to do that we will be using generics <> with the Object type NOT primitives; it is only needed on the left hand side
        //Although you might see it like this: List<Integer> numbers = new ArrayList<Integer();
        List<Integer> numbers = new ArrayList(); //We could use "ArrayList" but we want to use "List" because it is the actual interface that has multiple implementations

        //adding numbers one at a time
        numbers.add(1);
        numbers.add(2);

        //Adding multiple numbers to our list; I created an array of numbers
        int[] numbs = {3, 5, 8, 9};

        //I looped through numbs array and added every numb to our numbers List
        for (int numb : numbs) {
            numbers.add(numb);
        }

        //Delete an item
        numbers.remove(0);

        System.out.println(numbers);

        for (int number : numbers) { //We use Object instead of int when we don't use generics;
//            System.out.println(number);
        }

//        numbers.forEach(System.out::println); //This is another way of looping through a list that would give us the same result from example above
    }
}
