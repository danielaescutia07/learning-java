package main.java.com.daniela;

public class Inheritance {
    public static void main(String[] args) {
//        Animal animal = new Animal("bobby");
        AnimalInterface dog = new Dog("flex", "Bulldog");
        AnimalInterface cat = new Cat("rosie", true);

        System.out.println(dog.getName());
        System.out.println(cat.getName());

        cat.makeSound();
        dog.makeSound();

        SuperMath superMath = new SuperMath();
        System.out.println(superMath.add(1,90));
        System.out.println(superMath.add(3,6,8));
    }
}
