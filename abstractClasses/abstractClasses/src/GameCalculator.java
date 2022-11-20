public abstract class GameCalculator {

    public abstract void hesapla();
    // kim inherite ediyorsa hesapla yi icermek zorunda. fakat hesaplayi override etmek zorunda.

    public final void gameOver() {
        System.out.println("Oyun bitti.");
    }
    // GameCalculator ı kim kullaniyorsa gameOver ı oldugu gibi kullanmak zorunda.


}
