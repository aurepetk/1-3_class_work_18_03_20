import java.util.Scanner;

public class SecondTask {
    //cia parodo kaip susikurti KONSTANTA!!!
    private static final int MAX_NUMB = 100;

    public static void main(String[] args) {
        //cia yra scanner klase!!!
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite, kiek skaiciu noresite ivesti?");

        int kiek = sc.nextInt();
        //kvieti objekta tokiu vardu, kokiu susikurei

        int[] masyvas = new int[kiek];

        for (int i = 0; i < kiek; i++) {
            System.out.println("Iveskite " + i + " skaiciu.");
            masyvas[i] = sc.nextInt();
        }

        printMasyvas(masyvas);
    }

    private static void printMasyvas(int[] skMasyvas) {
        //sitas for ciklas nepriima int tipu (jokiu kintamuju tipu), bet tik klases!!! Todel rasai Integer
        for (Integer sk : skMasyvas) {
            if (sk >= MAX_NUMB) {
                System.out.println(sk);
            }
        }
    }
}
