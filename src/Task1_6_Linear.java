import static java.lang.Math.*;


//The class contains 6 static methods calculating functions(tasks 1 - 6, linear programming)
public class Task1_6_Linear {

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

    //The method takes a rational abc.def and convert it to rational def.abc
    public static double convertRational(double original) {
        double converted;
        String[] numbers = String.valueOf(original).split("\\.");
        if(abs(original) > 999.999 || numbers.length != 2 || numbers[1].length() != 3
                || (original < 0 && numbers[0].length() != 4) || (original > 0 && numbers[0].length() != 3))
            throw new IllegalArgumentException("Wrong argument");
        converted = (int)((original % 1) * 1000) + ((int)original) / 1000d;

        return converted;
    }

    //The method converts seconds (integer) into String HHч MMмин SSсек
    public static String convertSeconds(int sec) {
        String sign = sec < 0? "-" : "";
        sec = abs(sec);
        int hours = sec / 3600;
        int rest = sec % 3600;
        int minutes = rest / 60;
        int seconds = rest % 60;

        return String.format("%s%dч %dмин %dсек", sign, hours, minutes, seconds);
    }

    //The method checks if a point with coordinates x and y belongs to the area described in the task 6
    public static boolean checkBelong(double x, double y) {
        return (y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y >= -3 && y <= 0 && x >= -4 && x <= 4);
    }

    //just testing the methods above
    public static void main(String[] args) {
        System.out.println(firstSimpleFunction(1, 2.2, 0));
        System.out.println(secondSimpleFunction(-5, 2, -5));
        System.out.println(thirdSimpleFunction(0, 0.01));
        System.out.println(convertRational(-504.987));
        System.out.println(convertSeconds(-1111808));
        System.out.println(checkBelong(-4.9, -0.00001));

    }
}
