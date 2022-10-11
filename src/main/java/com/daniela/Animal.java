package main.java.com.daniela;

abstract public class Animal { //by making our class abstract, we can have abstract methods and subclasses can define some behaviors
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void makeSound(); //this is an abstract method; they don't have any implementation

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
