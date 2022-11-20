public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel";

        String yeniMesaj = mesaj.substring(0, 2);
        String yeni = sehirVer();

        System.out.println(yeniMesaj);
        System.out.println(mesaj);

        int sayi = topla(5,7);

        System.out.println(sayi);

        int toplam = topla2(2,3,4,5,6,10);
        // arka planda bu degerleri java bize diziye cevirir.

        System.out.println(toplam);

        // substring bir deger return etmektedir.



    }

    // void operasyonlar

    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");
    }

    public static void guncelle(){
        System.out.println("Guncelle");
    }

    public static int topla(int sayi1, int sayi2){

         // return 5; // bitir ve 5 döndür
        return sayi1+sayi2;

    }

    public static int topla2(int... sayilar){

        // variable arguments kullanim seklidir
        // sayilar bir dizi haline geliyor

        int toplam=0;
        for (int sayi : sayilar) {
            // sayilardaki her bir sayi icin demektir
            toplam+=sayi;
        }

        return toplam;

    }

    public static String sehirVer(){
        return "Ankara";
    }


}