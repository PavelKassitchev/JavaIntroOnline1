import static java.lang.Math.*;

//The class contains 3 static methods calculating functions(tasks 1 - 3)
public class T1_3 {

    //The method calculates function z=((a-3)*b/2)+c
    public static double firstSimpleFunction(double a, double b, double c) {
        return (a - 3) * b / 2 + c;
    }

    //The method calculates function z=(b+sqrt(b*b-4*a*c))/(2*a)-a*a*a*c+(1/(b*b))
    public static double secondSimpleFunction(double a, double b, double c) {
        return (b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a) - c * pow(a, 3) + pow(b, -2);
    }

    //The method calculates function ((sin x + cos y) / (cos x - sin y)) * tg xy, where x an y are in radians
    public static double thirdSimpleFunction(double x, double y) {
        return (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);
    }

    //just testing the methods above
    public static void main(String[] args) {
        System.out.println(firstSimpleFunction(1, 2.2, 0));
        System.out.println(secondSimpleFunction(-5, 2, -5));
        System.out.println(thirdSimpleFunction(0, 0.01));
    }
}
