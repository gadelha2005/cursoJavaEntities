package entites;

public class Conversion {

    public static double IOF = 0.06;

    public static double conventer(double dollarPrice , int dollarQuantity){
        return dollarPrice * dollarQuantity * (1 + IOF);
    }
}
