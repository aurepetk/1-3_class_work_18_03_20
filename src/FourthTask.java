import java.util.Arrays;
import java.util.Scanner;

public class FourthTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas = new int[5];
        int suma = 0;
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Iveskite " + i + " skaiciu");
            int sk = sc.nextInt();
            mas[i] = sk;
            suma += sk;
        }
        //atspausdins visa masyva:
        System.out.println("Jus ivedete siuos skaicius: " + Arrays.toString(mas) + ". Siu skaiciu suma yra " + suma);



    }
}
