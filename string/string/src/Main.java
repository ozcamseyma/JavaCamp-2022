public class Main {
    public static void main(String[] args) {

        // Stringler bir karakter dizisidir.
        // Stringler char array idir.

        String mesaj = "Bugün hava çok güzel.";

        System.out.println(mesaj); // string metini vermektedir.

        System.out.println("Eleman sayısı: " + mesaj.length()); // eleman sayisini vermektedir.

        System.out.println("5. eleman : " + mesaj.charAt(4)); // 5. elemani verir.

        System.out.println(mesaj.concat(" Yaşasın!")); // iki metni birlestirir.

        System.out.println(mesaj.startsWith("B")); // string baslangic kontrolü

        System.out.println(mesaj.endsWith(".")); // string bitis kontrolü

        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0); // karakterleri alma yontemi
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf('a')); // belirtilen karakterin mesajin icerisinde kacinci eleman oldugunu vermektedir.

        System.out.println(mesaj.lastIndexOf('a')); // aramaya sagdan baslar




    }
}