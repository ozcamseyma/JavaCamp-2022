public class Main {
    public static void main(String[] args) {

        // Ogrenci Array leri

        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("=================================");

        String[] ogrenciler = {"Engin", "Derin", "Salih"};

        for (int j = 0; j < ogrenciler.length; j++){
            System.out.println(ogrenciler[j]);
            // String array indeki elemanlari yazdirir.
        }

        System.out.println("=================================");

        String[] ogrencilers = new String[3];
        ogrencilers[0] = "Engin";
        ogrencilers[1] = "Derin";
        ogrencilers[2] = "Salih";

        for (int i = 0; i < ogrencilers.length; i++){
            System.out.println(ogrencilers[i]);
            // ogrencilerin ilgili elemanlarini okuyabilirim
        }

        System.out.println("=================================");

        for (String ogrenci : ogrenciler) {
            // ogrenciler dizisindeki her bir elemani gez
            // String + takmaad + dizinin adi
            System.out.println(ogrenci);
        }





    }
}