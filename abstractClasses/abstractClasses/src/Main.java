public class Main {
    public static void main(String[] args) {

        // Sadece bir class - bir class ı inherite edebilir.

        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        // ABSTRACT SINIFLAR ASLA NEWLENEMEZ !
        // GameCalculator gameCalculator = new GameCalculator();

        GameCalculator gameCalculator = new WomanGameCalculator();



    }
}