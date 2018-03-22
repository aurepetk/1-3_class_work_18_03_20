package Java18_03_22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FourthTask {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Iveskite savo svori kg:");
        double kg = getCorrectNumber();
        System.out.println("Iveskite savo ugi metrais:");
        double m = getCorrectNumber();
        System.out.println("Jusu KMI yra " + kmi(kg, m));

    }

    private static double kmi(double kg, double m) {
        double ats = kg / (Math.pow(m, 2));
        return ats;
    }

    private static double getCorrectNumber() {
        double result = 0.0;
        //while (true) - amzinas ciklas
        while (true) {
            try {
                result = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ivedete netinkama reiksme, bandykite is naujo.");
                /*jei vartotojas iveda bloga rezultata, tai scaneris neperkelia kursoriaus ir kursorius
                 *stovi visada toje pacioje eiluteje, todel parasome sc.nextLine(); kad kursorius persoktu
                 * i kita eilute!!!
                 */
                sc.nextLine();
            }
        }
        return result;
    }
}
