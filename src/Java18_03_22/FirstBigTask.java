import java.util.Scanner;

public class FirstBigTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Iveskite norima zodi, jei norite baigti - iveskite PABAIGA");
            String word = sc.nextLine();
            //next - nuskaito iki tarpo, nextLine - nuskaito visa eilute
            if (word.toLowerCase().equals("pabaiga")) {
                break;
            }
            if (word.length() % 2 == 0) {
                System.out.println("Ivestas zodis " + word + " yra lyginis, jo ilgis yra " + word.length());
            } else {
                System.out.println("Zodis " + word + " yra nelyginis. Jo ilgis yra " + word.length());
            }
            char letter = 'a';
            System.out.println("Radome " + letter + " raidziu: " + countHowMannyLetters(word, letter));
            //Sitas word.toLower.Case.equals pirma viska pavercia mazosiomis raidemis, tada palygini
        }

    }

    private static int countHowMannyLetters(String word, char letter) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;

    }
}
