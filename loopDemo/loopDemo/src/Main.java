public class Main {
    public static void main(String[] args) {


        // for

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("For Döngüsü bitti");

        // while

        int i = 1;
     /*
        while (1<10) {
            System.out.println(i);
        }

        // sonsuz döngü
        System.out.println("While Döngüsü Bitti");
     */

        while (i<10) {
            System.out.println(i);
            i++;
        }

        System.out.println("While Döngüsü Bitti");

        // Do-While
        int j=1;
        do {
            System.out.println(j);
            j+=2;
        } while (j<10);

        System.out.println("Do-While Döngüsü Bitti");




    }
}