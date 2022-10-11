package main.java.com.daniela;

public class Methods {
    public static void main(String[] args) {
        //What does each keyword mean?
        //access modifies - public, private or no access modifier key
        //static - this means it belongs to a class and NOT an instance; optional
        //void - it doesn't return anything; if none, specify what type is being returned

        int x = incrementNumber(0); //incrementNumber() can be assigned
        print(x); //because print() has the "void" keyword it doesn't return anything therefore it CANNOT be assigned
    }

    private static int incrementNumber(int value) { //if not "void", specify what type is being returned; in this case "int"
        return value + 1;
    }

    private static void print(int value) {
//        System.out.println(value);
    }
}
