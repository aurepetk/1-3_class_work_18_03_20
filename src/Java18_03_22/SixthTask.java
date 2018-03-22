package Java18_03_22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SixthTask {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Iveskite uzduoti:");
        String uzduotis = sc.nextLine();
        String[] items = splitString(uzduotis);
        double a = Double.valueOf(items[0]);
        double b = Double.valueOf(items[2]);
        switch (items[3]){

        }






    }

    private static String[] splitString (String uzduotis){
        //cia pvz kaip isskaidyti Stringa!!!
        String[] items = uzduotis.split(" ");
        return items;
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
