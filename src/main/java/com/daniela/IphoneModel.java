package main.java.com.daniela;

//Enums is a class that represents a group of constants
//We can hold all models here, but we would need to add IphoneModel to Iphone class under "String" for model
public enum IphoneModel {
    IPHONE_14_PRO_MAX("Iphone 14 Pro Max"),
    IPHONE_11_PRO("Iphone 11 Pro"),
    IPHONE_8("Iphone 8");


    //If we wanted a string representation of our models we would need to create a constructor (passing a String model) and getter
    //Then inside parenthesis, in quotes, input the models
    private String modelStr;

    IphoneModel(String modelStr) {
        this.modelStr = modelStr;
    }

    public String getModelStr() {
        return modelStr;
    }
}
