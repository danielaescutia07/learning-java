package main.java.com.daniela;

import java.math.BigDecimal;

//When dealing with money you should not be using double data type
public class DealingWithMoney {
    public static void main(String[] args) {
        double numberOne = 0.02;
        double numberTwo = 0.03;
        double result = numberTwo - numberOne;

//        System.out.println(result); //With double data type sometimes you end up losing values; Expected: 0.009999999999999998

        //To fix this problem we have to use BigDecimal
        BigDecimal numberOne1 = new BigDecimal("0.02");
        BigDecimal numberTwo1 = new BigDecimal("0.03");
        BigDecimal result1 = numberTwo1.subtract(numberOne1); //use .subtract(); expected: 0.01

//        System.out.println(result1);

        //Comparing numbers using BigDecimals
        double a = 1;
        double b = 2;
//        System.out.println(a <= b);

        BigDecimal numberOne2 = new BigDecimal("0.02");
        BigDecimal numberTwo2 = new BigDecimal("0.03");
        BigDecimal result2 = numberTwo2.subtract(numberOne2);

        //When comparing numbers if numberOne2 < numberTwo2 = -1; if same = 0; if numberOne2 > numberTwo2 = 1
        System.out.println(numberOne2.compareTo(numberTwo2));

    }
}
