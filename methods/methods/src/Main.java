public class Main {

    public Main(){

    }

    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca(){

        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean varMi = false;
        int[] var3 = sayilar;
        int var4 = sayilar.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            int sayi = var3[var5];
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        String mesaj = "";
        if (varMi) {
            mesaj = "Sayı mevcuttur: " + aranacak;
            mesajVer(mesaj);
        } else {
            mesajVer(mesaj);
        }


    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }

}