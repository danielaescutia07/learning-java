package main.java.com.daniela;

public class Classes {
    public static void main(String[] args) {
        //When we build a constructor inside Iphone, we can set the values like this
        Iphone iphone14 = new Iphone(IphoneModel.IPHONE_14_PRO_MAX, 1200.00, true); //Now, instead of passing a string we can pass a model from our IphoneModel file

        System.out.println(iphone14.getModel().getModelStr());

        //When no constructor is built inside Iphone, we would have to set values like this
//        iphone14.setModel("14 Pro Max");
//        iphone14.setPrice(1200.00);
//        iphone14.setWaterResistant(true);

//        System.out.println(iphone14.getModel());
//        System.out.println(iphone14.getPrice());
//        System.out.println(iphone14.isWaterResistant());

        System.out.println(iphone14); //When printing like this the outcome will give us an object number. Expected: main.java.com.daniela.Iphone@36baf30c
        //toString() allows us to have the string representation of an object; this has to be done inside Iphone class at the very bottom

    }
}
