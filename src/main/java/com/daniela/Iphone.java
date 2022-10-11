package main.java.com.daniela;

public class Iphone {
    private IphoneModel model; //We
    // included IphoneModel here instead of String
    private double price;
    private boolean isWaterResistant;

    //By default, every class has a constructor
    public Iphone() {}

    //Our built out constructor
    public Iphone(IphoneModel model, double price, boolean isWaterResistant) { //We included IphoneModel here instead of String
        this.model = model;
        this.price = price;
        this.isWaterResistant = isWaterResistant;
    }

    //We can set as many constructors as we want, but they cannot be identical
    //We can use the "this" to call out ot other constructor and set default values
    public Iphone (IphoneModel model) { //We included IphoneModel here instead of String
        this(model, 250.00, false); //the model will have to be set by you, but we have set default values for price and water resistance here
        this.model = model;
    }


    //These are BEHAVIORS - the functionality of a given object based on this class
    //use IntelliJ's shortcut; CONTROL + ENTER, select SETTERS AND GETTERS, select all, press ok
    //We can request model, price and water resistance
    //"this" is referring to the current instance of the current class
    //Similar to instance of State (if we were working w/JavaScript) "set" allows us to change the model, price of water resistance
    public IphoneModel getModel() { //We included IphoneModel here instead of String
        return model;
    }

    public void setModel(IphoneModel model) { //We included IphoneModel here instead of String
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        this.isWaterResistant = waterResistant;
    }

    //We can use IntelliJ's shortcut: CONTROL + ENTER, select toString(), select every field, click ok; this will allow us to view the object in string representation
    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", isWaterResistant=" + isWaterResistant +
                '}';
    }
}


//OOP
//Encapsulation - the data of your classes should be hidden from the outside world and be accessible through its own methods; it gives us full control on how data is accessed
//Inheritance - an object acquires all the properties and behaviors of a parent object
//Abstraction - process of hiding certain details and showing essential information to our users
//Polymorphism - many forms; different implementations of a method; performing same actions in different ways
//Interfaces - another way of achieving abstraction;
//Method Overloading - another way to achieve polymorphism