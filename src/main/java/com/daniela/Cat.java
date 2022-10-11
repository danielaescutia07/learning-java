package main.java.com.daniela;

public class Cat implements AnimalInterface{
    private boolean hasToy;
    private String name;
    public Cat(String name, boolean hasToy) {
        this.hasToy = hasToy;
        this.name = name;
    }

    public boolean getHasToy() {
        return hasToy;
    }

    public void setHasToy(boolean hasToy) {
        this.hasToy = hasToy;
    }

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
