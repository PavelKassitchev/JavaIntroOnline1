import java.math.BigDecimal;

//This class contains 5 branching tasks
public class Task1_5_Branching {

    //This method gets 2 integer arguments in degrees and checks if a triangle exists and if it is a right angle triangle
    public static boolean[] checkTriangle(int a, int b) {
        boolean[] checks = new boolean[2];
        if(a <= 0 || b <= 0 || (a + b) >= 180) {
            checks[0] = false;
            checks[1] = false;
        }
        else {
            checks[0] = true;
            if(a == 90 || b == 90 || (a + b) == 90) {
                checks[1] = true;
            }
            else checks[1] = false;
        }
        return checks;
    }

    //This method finds max(min(a, b), min(c, d))
    public static double findMamimin(double a, double b, double c, double d) {
        double firstMin = (a < b)? a : b;
        double secondMin = (c < d)? c : d;
        double max = (firstMin > secondMin)? firstMin : secondMin;
        return max;
    }

    //This method checks if three points - (a, b), (c, d) and (e, f) - are located on a straight line
    public static boolean checkLine(BigDecimal x1, BigDecimal y1, BigDecimal x2, BigDecimal y2, BigDecimal x3, BigDecimal y3) {
        //checks if (x_3 - x_1) / (x_2 - x_1) == (y_3 - y_1) / (y_2 - y_1)
        return (x3.subtract(x1)).multiply((y2.subtract(y1))).equals((y3.subtract(y1).multiply(x2.subtract(x1))));
    }

    //This method checks if a brick with dimensions x, y and z gets through a rectangle hole with sides len and wid
    public static boolean checkBrick(double len, double wid, double x, double y, double z) {

        return false;
    }

    //This is just to check the methods above
    public static void main(String[] args) {
        System.out.println(checkTriangle(88, 1)[0] + " " + checkTriangle(88, 1)[1]);
        System.out.println(findMamimin(4.3, -3, 22, 0));
        System.out.println(checkLine(new BigDecimal(0), new BigDecimal(0), new BigDecimal(1),
                new BigDecimal(1), new BigDecimal(-1.1), new BigDecimal(-1.1)));
    }

}