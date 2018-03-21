import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class FirstTask {
    //alt+shif+? - viska uzkomentuoja
    //ctrl + alt + l - suformatuoja koda!!!
    public static void main(String[] args) {
        //ctrl + space arba tab ant Scanner ismeta pasiulymus programeliu
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite skaiciu");

        int numb = sc.nextInt();

        if (numb % 2 == 0) {
            System.out.println(numb + " yra lyginis");
        } else {
            System.out.println(numb + " nelyginis");
        }
    }
}
