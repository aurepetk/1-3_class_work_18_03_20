import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sk = 0;
        int kiek = 0;
        int[] mas = {};

        do {
            System.out.println("Veskite skaicius tol, kol ivesite 0");
            try {
                sk = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Eik tu, durneli... Bandyk dar karta");
                sc.nextLine();
                //su sc tai prasys naujo sk, o jei nori kad baigtu darba tai sk=0; ir tuomet baigs darba
            }
            if (mas.length <= kiek) {
                mas = Arrays.copyOf(mas, mas.length + 1);
            }
            mas[kiek++] = sk;
        } while (sk != 0);

        System.out.println("Suma yra: " + suma(mas));
    }

    private static int suma(int[] mas) {
        int sum = 0;
        for (Integer m : mas) {
            sum += m;
        }
        return sum;
    }
}
