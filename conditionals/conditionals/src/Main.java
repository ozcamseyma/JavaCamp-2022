public class Main {
    public static void main(String[] args) {

        // Sartlı Blok : Bir kosula bagli olmasi gerekmektedir

        int sayi = 19;
        if (sayi < 20) {
            System.out.println("Sayı 20 den küçüktür");
        }   else {
            System.out.println("Sayı 20 den küçükt değildir");
        }

        int sayi2 = 20;
        if (sayi2 < 20) {
            System.out.println("Sayı 20 den küçüktür");
        } else if (sayi2 == 20){
            System.out.println("Sayı 20 ye eşittir");
        } else {
            System.out.println("Sayı 20 den büyüktür");
        }



    }
}