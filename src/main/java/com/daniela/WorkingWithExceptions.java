package main.java.com.daniela;


public class WorkingWithExceptions {
    public static void main(String[] args) {
        String brand = null;

        try {
            System.out.println(brand.length());
        } catch (Exception e) { //We use Exception in case we don't know where exception is thrown
            System.out.println("brand is null");
        }


    }
}
