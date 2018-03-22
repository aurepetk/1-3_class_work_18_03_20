package Java18_03_22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FifthTask {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Iveskite nuvaziuotus kilometrus:");
        double km = getCorrectNumber();
        System.out.println("Iveskite kuro sanaudas:");
        double sanaudos = getCorrectNumber();
        System.out.println("Automobilio kuro sanaudos yra " + kuroSanaudos(km, sanaudos));
    }

    private static double kuroSanaudos(double km, double sanaudos) {
        double ats = (sanaudos * 100) / km;
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
