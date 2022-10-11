package main.java.com.daniela;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Lists and Sets are similar; the only difference is that Sets CANNOT have duplicate elements; order is not guaranteed
//To preserve order, we can use LinkedHashSet<>() or TreeSet<>()
public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Character> charactersSet = new HashSet<>();
        charactersSet.add('A');
        charactersSet.add('B');
        charactersSet.add('C');

        //this is how you loop through using iterators
        Iterator<Character> iterator = charactersSet.iterator();

        while (iterator.hasNext()) {
            Character character = iterator.next();
            System.out.println(character);
        }

        //looping using for loop
        for (char character : charactersSet) {
            System.out.println(character);
        }
    }
}
