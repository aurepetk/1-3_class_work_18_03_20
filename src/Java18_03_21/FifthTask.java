import java.util.Arrays;
import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] mas = new String[5];
        for (int i = 0; i < mas.length; i++){
            System.out.println("Iveskite " + i + " zodi.");
            String zodis = sc.nextLine();
            mas [i] = zodis;
        }
        System.out.println(Arrays.toString(mas));
    }
}
