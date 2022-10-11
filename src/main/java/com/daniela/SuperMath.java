package main.java.com.daniela;

//Method overloading allows us to name methods the same as long as they have different behaviors
//In this case the first add only add two numbers; the second add method add three numbers
public class SuperMath {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
