package main.java.com.daniela;

import java.util.Optional;

//Better way to handle null values; another way of functional programming
public class Optionals {
    public static void main(String[] args) {
        String brand = null;
        String theBrand = Optional.ofNullable(brand)
                .map(String::toUpperCase) //if variable brand is NOT null it will return it in uppercase
                .orElse("Brand is null"); //else it will return this string

        System.out.println(theBrand);
    }
}
