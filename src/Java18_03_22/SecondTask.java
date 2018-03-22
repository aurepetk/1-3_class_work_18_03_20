package Java18_03_22;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        word = word.replaceAll(" ", "");
        //kai tikrinam su boolean tai automatiskai if tikrins ar boolean (jei ji prisilyginom true)
        if (tikrinam(word)) {
            System.out.println("Sis zodis/fraze yra polindromas");
        } else {
            System.out.println("Sis zodis/fraze NERA polindromas");
        }

    }

    private static boolean tikrinam(String word) {
        boolean ats = true;
        for (int i = 0; i < word.length(); i++) {
            //charAt - paima is zodzio po viena raide
            char pradzia = word.charAt(i);
            char galas = word.charAt(word.length() - 1 - i);
            if (pradzia != galas) {
                ats = false;
                break;
            }
        }
        return ats;
    }
}
