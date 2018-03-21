import java.util.Arrays;

public class SixthTask {
    public static void main(String[] args) {
        String[] skaiciai = {"1", "2", "3", "4"};
        String[] raides = {"a", "b", "c", "d"};
        System.out.println(Arrays.toString(sumaisom(skaiciai,raides)));

    }

    private static String[] sumaisom(String[] skaiciai, String[] raides) {
        String[] galutinis = new String[4];
        for (int i = 0; i < skaiciai.length; i++) {
            String naujas = skaiciai[i] + raides[i];
            galutinis[i] = naujas;
        }
        return galutinis;
    }
}
