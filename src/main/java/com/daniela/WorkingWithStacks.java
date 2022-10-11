package main.java.com.daniela;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //We use .push() and pass an element; last one in is the first one out (or LIFO)
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        //.peek() allows us to see what element is at the top of the stack
        System.out.println(stack.peek());

        //.pop() removes and returns the element at the top
        stack.pop();

        System.out.println(stack);

    }
}
