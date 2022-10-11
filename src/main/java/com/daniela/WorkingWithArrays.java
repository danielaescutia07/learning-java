package main.java.com.daniela;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int [] numbers = new int[3]; //putting the number 3 will allow storage for 2 number values
        numbers[0] = 11; //this is how we store numbers in the array
        numbers[1] = 122;
        numbers[2] = 37;
//        System.out.println(Arrays.toString(numbers)); // expected [0, 0] every number will be zero until given a value; default for booleans is false and Strings is null

        int[] numbers1 = {1, 20, 500, 4}; //Much easier way where size specification is not required
//        System.out.println(Arrays.toString(numbers1));
//        System.out.println(numbers1.length);

        for (int number: numbers1) {
//            System.out.println(number);
        }

        for (int i = 0; i < numbers1.length; i++) {
//            System.out.println(numbers1[i]);
        }

        String[] names = {"Dani", "Gabby", "Paco"};
//        System.out.println(Arrays.toString(names));
//        System.out.println(names.length);

        //Arrays and Indexes
        int[] numbers2 = {2, 0, 1, 4, 100};
        int oneHundred = numbers2[4];
        int four = numbers2[3];
//        System.out.println(oneHundred);
//        System.out.println(four);
//        System.out.println(numbers2[1]);
    }
}
