public class SeventhTask {
    public static void main(String[] args) {
        int [][] matrica = {{1,3,-4},{5,7,-2}};
        int kiekis = 0;
        for (int i = 0; i<matrica.length; i++){
            for (int j = 0; j < matrica[i].length; j++){
                int sk = matrica [i][j];
                if (sk > 0){
                    kiekis += 1;
                }
            }
        }
        System.out.println(kiekis);
    }
}
