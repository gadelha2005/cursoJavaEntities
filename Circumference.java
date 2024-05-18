package entites;

public class Circumference {
 
    public static final double PI = 3.14;

    public static double circunferencia(double radius){
        return 2 * PI * radius;
    }
    public static double volume(double radius){
        return 4 * PI * Math.pow(radius, 3) / 3;
    }

}
