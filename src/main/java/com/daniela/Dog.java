package main.java.com.daniela;

//this is an example of inheritance; Dog is an animal, so we use extends Animal and build a constructor
public class Dog implements AnimalInterface{
    private String breed;
    private String name;

    public Dog(String name, String breed) {
        this.breed = breed;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override //we can get rid of "@Override"; it helps us to override the behavior in the parent class (Animal class)
    public void makeSound() {
        System.out.println("woof woof");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
