package Java18_03_22;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kokios figuros plota noresite skaiciuoti?");
        System.out.println("1 - Stacio trikampio;");
        System.out.println("2 - Staciakampio;");
        System.out.println("3 - Kvadrato;");
        System.out.println("4 - Apskritimo.");
        System.out.println("Pasirinkima iveskite parasydami jo numeri.");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Iveskite dvi trikampio krastines, kurios sudaro statu kampa:");
                int at = sc.nextInt();
                int bt = sc.nextInt();
                System.out.println("Plotas - " + trikampis(at, bt));
                break;
            case 2:
                System.out.println("Iveskite staciakampio krastines:");
                int as = sc.nextInt();
                int bs = sc.nextInt();
                System.out.println("Plotas - " + staciakampis(as, bs));
                break;
            case 3:
                System.out.println("Iveskite kvadrato krastines ilgi:");
                int ak = sc.nextInt();
                System.out.println("Plotas - " + kvadratas(ak));
                break;
            case 4:
                System.out.println("Iveskite apskritimo perimetra:");
                int aa = sc.nextInt();
                System.out.println("Plotas - " + apskritimas(aa));
                break;
            default:
                System.out.println("Ivedete nesama pasirinkima");
                break;
        }
    }

    private static int trikampis(int at, int bt) {
        int atst = (at * bt) / 2;
        return atst;
    }

    private static int staciakampis(int as, int bs) {
        int atss = as * bs;
        return atss;
    }

    private static double kvadratas(int ak) {
        double atsk = Math.pow(ak, 2);
        return atsk;
    }

    private static double apskritimas(int aa) {
        double atsa = Math.pow(aa, 2) * 3.1415d;
        return atsa;
    }


}
