/**
 * Created by ivanpryshchepau on 6/23/16.
 */
public class _Runner {

    public static void main(String[] args) {

        try {
            System.out.println("Perimeter = " + calculatePerimeter(args[0], args[1]));
            System.out.println("Square = " + calculateSquare(args[0], args[1]));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Write length of 2 sides!!!");
        }


    }

    public static double calculatePerimeter(String aS, String bS) {
        double result;

        double a = Double.parseDouble(aS);
        double b = Double.parseDouble(bS);

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        result = a + b + c;

        return result;
    }

    public static double calculateSquare(String aS, String bS) {
        double result;

        double a = Double.parseDouble(aS);
        double b = Double.parseDouble(bS);

        result = (a * b) / 2;

        return result;
    }

}
