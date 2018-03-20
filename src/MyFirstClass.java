public class MyFirstClass {

    //psvm + enter - sukuria main metoda
    public static void main(String[] ags){
        //sout + enter - atspausdinimui
        System.out.println("Hello world");

        int a = 10;

        //Cia yra sukurtas MyFirstClass klases objektas, jis iskviecia metoda, kuris yra ne static
        MyFirstClass myFirstClass = new MyFirstClass();

        myFirstClass.myNotStaticMethod(a);

        //iskvieciamas statinis metodas toje pacioje klaseje
        myStaticMethod();

        float b = 4.6f;
        double c = 2.4d;

        boolean d = true;//false

        char e = 'A';

        String f = "This is String";
    }

    private void myNotStaticMethod(int numb){
        System.out.println("Jusu skaicius " + numb);
    }

    private static void myStaticMethod(){
        System.out.println("Cia yra statinis metodas");
    }

}
